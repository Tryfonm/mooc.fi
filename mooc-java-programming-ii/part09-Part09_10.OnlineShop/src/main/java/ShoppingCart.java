
import java.util.Map;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author micha
 */
public class ShoppingCart {

    private Map<String, Item> cart;

    public ShoppingCart() {
        this.cart = new HashMap<>();
    }

    public void add(String product, int price) {
        if (!(this.cart.containsKey(product))) {
            this.cart.put(product, new Item(product, 1, price));
        } else {
            this.cart.get(product).increaseQuantity();
        }
    }

    public int price() {
        int sumPrice = 0;
        for (Item item : this.cart.values()) {
            sumPrice += item.price();
        }
        return sumPrice;
    }

    public void print() {
        for (String productName : this.cart.keySet()) {
            System.out.println(productName + ": " + this.cart.get(productName).quantity());
        }
    }
}
