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

    private final Scanner scanner;
    private Database db;

    public UserInterface(Scanner scanner, Database db) {
        this.scanner = scanner;
        this.db = db;
    }

    public void start() {
        while (true) {
            System.out.println("?");
            String command = scanner.nextLine();

            if (command.equals("Add")) {
                System.out.println("Name:");
                String inputName = scanner.nextLine();
                System.out.println("Name in Latin:");
                String inputNameInLatin = scanner.nextLine();
                this.db.addBird(new Bird(inputName, inputNameInLatin));

            } else if (command.equals("Observation")) {
                System.out.println("Bird?");
                String inputBirdName = scanner.nextLine();
                db.addObservationToBird(inputBirdName);

            } else if (command.equals("All")) {
                for (Bird bird : this.db.getAllBirds()) {
                    System.out.println(bird);
                }

            } else if (command.equals("One")) {
                System.out.println("Bird?");
                String inputBirdName = scanner.nextLine();
                db.printOneBird(inputBirdName);

            } else if (command.equals("Quit")) {
                break;
            }
        }
    }
}
