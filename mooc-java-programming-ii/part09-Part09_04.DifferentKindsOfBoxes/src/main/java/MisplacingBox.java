/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author micha
 */
public class MisplacingBox extends Box {

    private boolean occupied;
    private Item itemInTheBox;

    public MisplacingBox() {

    }

    @Override
    public void add(Item item) {
        this.itemInTheBox = item;
    }

    @Override
    public boolean isInBox(Item item) {
        return false;
    }
}
