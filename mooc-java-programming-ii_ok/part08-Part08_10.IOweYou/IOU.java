/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kasia
 */
import java.util.HashMap;
public class IOU {

    private HashMap<String, Double> iou;
    public IOU() {
        this.iou = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount) {
        //saves the amount owed and the person owed to to the IOU.
        iou.put(toWhom, amount);
    }
    public double howMuchDoIOweTo(String toWhom) {
        //returns the amount owed to the person whose name is given as a parameter. If the person cannot be found, it returns 0.
        return iou.getOrDefault(toWhom, Double.valueOf(0));
    }    
}
