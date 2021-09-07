
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author micha
 */
public class Warehouse {

    private Map<String, Integer> itemPrices;
    private Map<String, Integer> itemStocks;

    public Warehouse() {
        this.itemPrices = new HashMap<>();
        this.itemStocks = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.itemPrices.put(product, price);
        this.itemStocks.put(product, stock);
    }

    public int price(String product) {
        if (this.itemPrices.keySet().contains(product)) {
            return this.itemPrices.get(product);
        }
        return -99;
    }

    public int stock(String product) {
        if (this.itemStocks.keySet().contains(product)) {
            return this.itemStocks.get(product);
        }
        return 0;
    }

    public boolean take(String product) {
        if (this.itemStocks.keySet().contains(product)) {
            if (this.itemStocks.get(product) > 0) {
                int currentValue = this.itemStocks.get(product);
                this.itemStocks.replace(product, currentValue - 1);
                return true;
            }
        }
        return false;
    }

    public Set<String> products() {
        return new HashSet<String>(this.itemPrices.keySet());
    }
}
