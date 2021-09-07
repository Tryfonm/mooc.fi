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

public class Room {

    private ArrayList<Person> listOfPersons;

    public Room() {
        this.listOfPersons = new ArrayList<>();
    }

    public void add(Person person) {
        this.listOfPersons.add(person);
    }

    public boolean isEmpty() {
        if (this.listOfPersons.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<Person> getPersons() {
        return this.listOfPersons;
    }

    public Person shortest() {
        if (this.listOfPersons.isEmpty()) {
            return null;
        } else {
            Person shortestPerson = this.listOfPersons.get(0);
            int height = shortestPerson.getHeight();
            for (Person person : this.listOfPersons) {
                if (person.getHeight() < shortestPerson.getHeight()) {
                    shortestPerson = person;
                    height = person.getHeight();
                }
            }
            return shortestPerson;
        }
    }

    public Person take() {
        if (this.listOfPersons.isEmpty()) {
            return null;
        } else {
            Person shortestPerson = this.shortest();
            int shortestIndex = this.listOfPersons.indexOf(shortestPerson);
            return this.listOfPersons.remove(shortestIndex);
        }
    }
}
