/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author micha
 */
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private Archive archive;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
    }

    public void start() {
        Archive archive = new Archive();

        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            archive.addPoint(input);
        }
        archive.printOverallAverage();
        archive.printPassingAverage();
        archive.printDistribution();
    }

}
