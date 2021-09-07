/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author micha
 */
public class Item {

    private String identifier;
    private String name;

    public Item(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    public String toString() {
        return this.identifier + ": " + this.name;
    }

    public boolean equals(Item compared) {
        if (this.identifier.equals(compared.identifier)) {
            return true;
        }
        return false;
    }
}
