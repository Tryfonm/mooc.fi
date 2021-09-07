package title;

import java.util.Scanner;
import javafx.application.Application;

public class Main {

    public static void main(String[] args) {

        System.out.println("Please insret a title!");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        Application.launch(UserTitle.class, "--inputTitle=" + userInput);
    }
}
