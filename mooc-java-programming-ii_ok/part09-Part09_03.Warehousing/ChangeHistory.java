/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kasia
 */
import java.util.ArrayList;
public class ChangeHistory {
    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }
    
    public void add(double status) {
        history.add(status);
    }
    
    public void clear() {
        history = new ArrayList<>();
    }
    
    public String toString() {
        return history.toString();
    }
    
    public double maxValue() {
        double max = 0.0;
        for (double number : history) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }
    
    public double minValue() {
        double min = 0.0;
        if (history.size() > 0) {
            min = history.get(0);
        }
        for (double number : history) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }
    
    public double average() {
        double sum = 0.0;
        int count = 0;
        for (double number : history) {
            sum += number;
            count ++;
        }
        if (sum > 0) {
            return sum/count;
        }
        return 0.0;
    }
}
