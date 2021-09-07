
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author micha
 */
public class Bird {

    private final String name;
    private final String nameInLatin;
    private int observations;

    public Bird(String name, String nameInLatin) {
        this.name = name;
        this.nameInLatin = nameInLatin;
        this.observations = 0;
    }

    public String getName() {
        return this.name;
    }

    public String getNameInLatin() {
        return this.nameInLatin;
    }

    public void addObservation() {
        this.observations++;
    }

    public int getNumberOfObservations() {
        return this.observations;
    }

    @Override
    public String toString() {
        return this.name + "(" + this.nameInLatin + "): " + this.getNumberOfObservations() + " observations";

    }
}
