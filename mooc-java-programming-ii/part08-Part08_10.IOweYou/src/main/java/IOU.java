
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
public class IOU {

    private HashMap<String, Double> iouDatabase;

    public IOU() {
        this.iouDatabase = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        this.iouDatabase.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        if (iouDatabase.keySet().contains(toWhom)) {
            return iouDatabase.get(toWhom);
        }
        return 0;
    }
}
