/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kasia
 */
public class Item {
    private String product;
    private int qty;
    private int unitPrice;

    public Item(String product, int qty, int unitPrice) {
        this.product = product;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public String getProduct() {
        return product;
    }

    public int getQty() {
        return qty;
    }

    public int getUnitPrice() {
        return unitPrice;
    }
    
    public int price() {
        //return the price of the item. You get the items price by multiplying 
        //its unit price by its quantity(qty).
        return qty * unitPrice;
    }
    public void increaseQuantity() {
        //increases the quantity by one.
        qty ++;
    }
    public String toString() {
        //returns the string representation of the item.
        //which must match the format shown in the example below.
        return product + ": " + qty;
    }    
}
