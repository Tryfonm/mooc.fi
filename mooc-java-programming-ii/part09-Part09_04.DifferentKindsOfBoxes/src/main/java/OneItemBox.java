/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author micha
 */
public class OneItemBox extends Box {

    private boolean occupied;
    private Item itemInTheBox;

    public OneItemBox() {
        this.occupied = false;
    }

    @Override
    public void add(Item item) {
        if (this.occupied == false) {
            this.itemInTheBox = item;
            this.occupied=true;
        }
    }

    @Override
    public boolean isInBox(Item item) {
        if (item.equals(this.itemInTheBox)) {
            return true;
        }
        return false;
    }
}
