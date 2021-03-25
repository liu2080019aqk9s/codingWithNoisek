/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 *
 * @author Kasia
 */
public class Dictionary {
    
    private ArrayList<String> words;
    private HashMap<String, String> dictionary;

    public Dictionary() {
        this.words = new ArrayList<>();
        this.dictionary = new HashMap<>();
        
        add("słowo", "word");
    }
    
    public String get(String word) {
        return dictionary.get(word);
    }
    
    public void add(String word, String translation) {
        if (!words.contains(word)) {
            words.add(word);
        }
        
        dictionary.put(word, translation);
    }
    
    public String getRandomWord() {
        Random random = new Random();
        return words.get(random.nextInt(words.size()));
    }
}
