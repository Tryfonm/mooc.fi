
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
public class BoxWithMaxWeight extends Box {

    private int maxCapacity;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.maxCapacity = capacity;
        this.items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {

        int currentWeight = 0;
        for (Item i : this.items) {
            currentWeight += i.getWeight();
        }

        if (currentWeight + item.getWeight() <= this.maxCapacity) {
            this.items.add(item);
            currentWeight += item.getWeight();
        }
    }

    @Override
    public boolean isInBox(Item item) {
        if (this.items.contains(item)) {
            return true;
        }
        return false;
    }
}
