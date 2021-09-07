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

    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList toDoList, Scanner scanner) {
        this.todoList = toDoList;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("Command:");
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                break;

            } else if (command.equals("add")) {
                System.out.println("To add:");
                String toBeAdded = scanner.nextLine();
                todoList.add(toBeAdded);

            } else if (command.equals("list")) {
                todoList.print();

            } else if (command.equals("remove")) {
                System.out.println("Which one is removed?");
                int toBeRemovedIndex = Integer.valueOf(scanner.nextLine());
                todoList.remove(toBeRemovedIndex);
            }
        }
    }
}
