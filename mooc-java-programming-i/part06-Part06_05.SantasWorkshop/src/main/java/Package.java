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

public class Package {

    private ArrayList<Gift> listOfGifts;

    public Package() {
        this.listOfGifts = new ArrayList<>();
    }

    public void addGift(Gift gift) {
        this.listOfGifts.add(gift);
    }

    public int totalWeight() {
        int sumWeight = 0;
        for (Gift gift : listOfGifts) {
            sumWeight += gift.getWeight();
        }
        return sumWeight;
    }
}
