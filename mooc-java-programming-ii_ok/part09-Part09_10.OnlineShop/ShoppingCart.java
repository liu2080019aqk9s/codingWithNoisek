
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kasia
 */
public class ShoppingCart {
    private List<Item> shopCart;

    public ShoppingCart() {
        shopCart = new ArrayList<>();
    }
    
    public void add(String product, int price) {
        //adds an item to the cart that matches the product given as a parameter, 
        //with the price given as a parameter.
        for (Item item : shopCart) {
            if (product.equals(item.getProduct()) && price == item.getUnitPrice()) {
                item.increaseQuantity();
                return;
            }
        }
        shopCart.add(new Item(product, 1, price));
    }
    public int price() {
        //returns the total price of the shopping cart.
        int sum = 0;
        for (Item item : shopCart) {
            sum += item.price();
        }
        return sum;
    }
    public void print() {
        for (Item item : shopCart) {
            System.out.println(item.getProduct() + ": " + item.getQty());
        }
    }
}
