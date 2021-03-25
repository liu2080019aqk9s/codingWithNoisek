/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Kasia
 */
public class SaveableDictionary {
    private HashMap<String, String> dictionary;
    private String file;
    public SaveableDictionary() {
        dictionary = new HashMap<>();
        file = null;
    }
    public SaveableDictionary(String file) {
        dictionary = new HashMap<>();
        this.file = file;
    }
    public void add(String words, String translation) {
        //adds a word to the dictionary. Every word has just one translation, 
        //and if the same word is added for the second time, nothing happens.
        dictionary.putIfAbsent(words, translation);
        dictionary.putIfAbsent(translation, words);
    }
    public String translate(String word) {
        //returns the translation for the given word. If the word is not in the dictionary, returns null.
        return dictionary.getOrDefault(word, null);
    }
    public void delete(String word) {
        dictionary.remove(dictionary.get(word));
        dictionary.remove(word);
    }
    public boolean load() {
        try {
            Scanner fileReader = new Scanner(new File(file));
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");
                this.add(parts[0], parts[1]);
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public boolean save() {
        try {
            PrintWriter writer = new PrintWriter(file);
            ArrayList<String> saved = new ArrayList<>();
            for (String word : dictionary.keySet()) {
                if (!saved.contains(word)) {
                    writer.println(word + ":" + dictionary.get(word));
                    saved.add(word);
                    saved.add(dictionary.get(word));
                }
            }
            //dictionary.forEach((key, value) -> writer.println(key + ":" + value));
            writer.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
