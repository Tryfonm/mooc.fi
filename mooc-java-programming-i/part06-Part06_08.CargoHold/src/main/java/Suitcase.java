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

public class Suitcase {

    private int maxWeight;
    private int currentWeight;
    private ArrayList<Item> items;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        if (this.currentWeight + item.getWeight() <= this.maxWeight) {
            this.currentWeight += item.getWeight();
            items.add(item);
        }
    }

    public String toString() {
        if (this.items.size() == 0) {
            return "no items (0 kg)";
        } else if (this.items.size() == 1) {
            return this.items.size() + " item (" + this.currentWeight + " kg)";
        } else {
            return this.items.size() + " items (" + this.currentWeight + " kg)";
        }
    }

    public void printItems() {
        for (Item item : this.items) {
            System.out.println(item.getName() + "(" + item.getWeight() + " kg)");
        }
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Item item : this.items) {
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }

    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        } else {
            Item heaviestItem = this.items.get(0);
            for (Item item : items) {
                if (item.getWeight() > heaviestItem.getWeight()) {
                    heaviestItem = item;
                }
            }
            return heaviestItem;
        }

    }
}
