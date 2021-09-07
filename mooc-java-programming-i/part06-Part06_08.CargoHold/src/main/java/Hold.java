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

public class Hold {

    private ArrayList<Suitcase> suitcases;
    private int maxWeight;
    private int currentWeight;

    public Hold(int maxWeight) {
        this.suitcases = new ArrayList<>();
        this.maxWeight = maxWeight;
        this.currentWeight = 0;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (this.currentWeight + suitcase.totalWeight() <= this.maxWeight) {
            this.currentWeight += suitcase.totalWeight();
            this.suitcases.add(suitcase);
        }
    }

    public String toString() {
        return this.suitcases.size() + " suitcases (" + this.currentWeight + " kg)";
    }
    
    public void printItems(){
        for (Suitcase suitcase: this.suitcases){
            suitcase.printItems();
        }
    }
}
