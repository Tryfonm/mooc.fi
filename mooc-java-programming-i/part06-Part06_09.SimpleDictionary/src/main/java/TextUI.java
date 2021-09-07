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

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {
        while (true) {
            System.out.println("Command:");
            String command = this.scanner.nextLine();

            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;

            } else if (command.equals("add")) {
                System.out.println("Word:");
                String word = this.scanner.nextLine();
                System.out.println("Translation");
                String translation = this.scanner.nextLine();
                dictionary.add(word, translation);

            } else if (command.equals("search")) {
                System.out.println("To be translated:");
                String toBeTranslated = this.scanner.nextLine();
                String translation = dictionary.translate(toBeTranslated);
                if (translation == null) {
                    System.out.println("Word " + toBeTranslated + " was not found");
                } else {
                    System.out.println("Translation: " + translation);
                }

            } else {
                System.out.println("Unknown command");

            }
        }
    }
}
