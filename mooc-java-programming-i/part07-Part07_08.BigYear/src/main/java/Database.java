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

public class Database {

    private ArrayList<Bird> listOfBirds;

    public Database() {
        this.listOfBirds = new ArrayList<>();
    }

    public void addBird(Bird bird) {
        this.listOfBirds.add(bird);
    }

    public void addObservationToBird(String birdName) {

        boolean notInList = true;
        for (Bird bird : this.listOfBirds) {
            if (bird.getName().equals(birdName)) {
                notInList = false;
            }
        }
        if (notInList == false) {
            for (Bird bird : this.listOfBirds) {
                if (bird.getName().equals(birdName)) {
                    bird.addObservation();
                }
            }
        } else {
            System.out.println("Not a bird!");
        }
    }

    public ArrayList<Bird> getAllBirds() {
        return this.listOfBirds;
    }

    public void printOneBird(String BirdName) {
        for (Bird bird : this.listOfBirds) {
            if (bird.getName().equals(BirdName)) {
                System.out.println(bird);
            }
        }
    }
}
