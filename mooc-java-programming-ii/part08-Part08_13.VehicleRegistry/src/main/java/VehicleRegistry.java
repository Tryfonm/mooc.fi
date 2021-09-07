/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author micha
 */
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class VehicleRegistry {

    private HashMap<LicensePlate, String> vehicleRegistry;

    public VehicleRegistry() {
        this.vehicleRegistry = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        for (LicensePlate lp : this.vehicleRegistry.keySet()) {
            if (lp.equals(licensePlate)) {
                return false;
            }
        }
        this.vehicleRegistry.put(licensePlate, owner);
        return true;
    }

    public String get(LicensePlate licensePlate) {
        if (this.vehicleRegistry.containsKey(licensePlate)) {
            return this.vehicleRegistry.get(licensePlate);
        }
        return null;
    }

    public boolean remove(LicensePlate licensePlate) {
        boolean isFound = false;
        for (LicensePlate lp : this.vehicleRegistry.keySet()) {
            if (lp.equals(licensePlate)) {
                isFound = true;
            }
        }
        if (isFound == true) {
            this.vehicleRegistry.remove(licensePlate);
            return true;
        }
        return false;
    }

    public void printLicensePlates() {
        for (LicensePlate lp : this.vehicleRegistry.keySet()) {
            System.out.println(lp.toString());
        }
    }

    public void printOwners() {
        Set<String> ownersList = new HashSet<>(this.vehicleRegistry.values());
        for (String owner : ownersList) {
            System.out.println(owner);
        }
    }
}
