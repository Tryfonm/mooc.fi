/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author micha
 */
public class Hideout<T> {

    private T toHide;

    public void putIntoHideout(T toHide) {
        this.toHide = toHide;
    }

    public T takeFromHideout() {
        if (this.toHide != null) {
            return this.toHide;
        }
        return null;
    }

    public boolean isInHideout() {
        if (this.toHide != null) {
            return true;
        }
        return false;
    }
}
