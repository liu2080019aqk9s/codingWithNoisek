
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kasia
 */
public class Hand implements Comparable<Hand>{
    private ArrayList<Card> hand;

    public Hand() {
        this.hand = new ArrayList<>();
    }
    
    public void add(Card card) {
        //adds a card to the hand
        hand.add(card);
    }
    public void print() {
        //prints the cards in hand as shown in the example below
        hand.stream()
                .forEach(card -> System.out.println(card.toString()));
    }
    public void sort() {
        hand.sort(null);
    }
    public void sortBySuit() {
        Collections.sort(hand, new BySuitInValueOrder());
    }
    public int count() {
        int sum = hand.stream()
                .map(card -> card.getValue())
                .reduce(0, (previousSum, value) -> previousSum + value);
        return sum;
    }
    @Override
    public int compareTo(Hand hand) {
        return this.count() - hand.count();
    }
}
