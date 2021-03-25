package ticTacToe;

import java.util.ArrayList;
import java.util.HashMap;

public class GameStatus {
    
    private ArrayList<Player> players;
    private Player turn;
    private boolean isFinished;
    private HashMap<Player, int[]> values;

    public GameStatus() {
        this.players = Player.allValues();
        this.turn = this.players.get(0);
        this.isFinished = false;
        this.values = new HashMap<>();
        this.values.put(players.get(0), new int[8]);
        this.values.put(players.get(1), new int[8]);
    }
    
    public void add(int row, int col) {
        values.get(turn)[col + 3] ++;
        if (row == col) {
            values.get(turn)[6] ++;
        }
        if (row + col == 2) {
            values.get(turn)[7] ++;
        }
        this.checkIfIsFinished();
    }
    
    private void checkIfIsFinished() {
        int[] list = values.get(turn);
        for (int i : list) {
            if(i == 3) {
                isFinished = true;
            }
        }
    }

    public void changeTurn() {
        turn = players.get((players.indexOf(turn) + 1) % players.size());
    }
    
    public Player getTurn() {
        return turn;
    }

    public boolean isFinished() {
        return isFinished;
    }
    
}
