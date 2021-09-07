/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author micha
 */
import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> toDoList;

    public TodoList() {
        this.toDoList = new ArrayList<>();
    }

    public void add(String task) {
        this.toDoList.add(task);
    }

    public void print() {
        int counter =1;
        for (String task: this.toDoList){
            System.out.println(counter + ": " + task);
            counter++;
        }
    }

    public void remove(int number) {
        this.toDoList.remove(number-1);
    }
}
