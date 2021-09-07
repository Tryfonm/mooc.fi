
import java.util.ArrayList;
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
public class StorageFacility {

    private HashMap<String, ArrayList<String>> storedUnits;

    public StorageFacility() {
        this.storedUnits = new HashMap<>();
    }

    public void add(String unit, String item) {
        if (this.storedUnits.get(unit) == null) {
            this.storedUnits.put(unit, new ArrayList<>());
        }
        this.storedUnits.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        if (this.storedUnits.keySet().contains(storageUnit)) {
            return this.storedUnits.get(storageUnit);
        }
        return new ArrayList<String>();
    }

    public void remove(String unit, String item) {
        if (this.storedUnits.get(unit).contains(item)) {
            this.storedUnits.get(unit).remove(item);
            if (this.storedUnits.get(unit).size() == 0) {
                this.storedUnits.remove(unit);
            }
        }
    }

    public ArrayList<String> storageUnits() {
        return new ArrayList<String>(this.storedUnits.keySet());
    }
}
