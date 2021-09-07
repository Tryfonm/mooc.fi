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
    private JokeManager jokeManager;

    public UserInterface(JokeManager jokeManager, Scanner scanner) {
        this.jokeManager = jokeManager;
        this.scanner = scanner;
    }

    public void start() {
        System.out.println("Commands:\n1 - add a joke\n2 - draw a joke\n3 - list of jokes\nX - stop");

        while (true) {
            String command = scanner.nextLine();

            if (command.equals("1")) {
                System.out.println("Write the joke to be added:");
                String inputJoke = scanner.nextLine();
                jokeManager.addJoke(inputJoke);

            } else if (command.equals("2")) {
                System.out.println(jokeManager.drawJoke());

            } else if (command.equals("3")) {
                System.out.println("Printing the jokes.");
                jokeManager.printJokes();

            } else if (command.equals("X")) {
                break;
            }
        }
    }
}
