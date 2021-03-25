/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticTacToe;

import java.util.ArrayList;

/**
 *
 * @author Kasia
 */
public enum Player {
    X, O;
    
    public static ArrayList<Player> allValues() {
        ArrayList<Player> players = new ArrayList<>();
        players.add(X);
        players.add(O);
        return players;
    }

}
