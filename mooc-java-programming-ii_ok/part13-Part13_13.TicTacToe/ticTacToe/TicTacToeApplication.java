package ticTacToe;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class TicTacToeApplication extends Application{
    
    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
    }

    @Override
    public void start(Stage window) {
        GameStatus gameStatus = new GameStatus();
        
        BorderPane layout = new BorderPane();
        GridPane buttons = new GridPane();
        layout.setPadding(new Insets(20, 20, 20, 20));
        buttons.setPadding(new Insets(20, 20, 20, 20));
        buttons.setAlignment(Pos.CENTER);
        buttons.setVgap(10);
        buttons.setHgap(10);
        
        Label info = new Label("Turn: " + gameStatus.getTurn());
        layout.setTop(info);
        layout.setCenter(buttons);
        
        ArrayList<Button> buttonsList = new ArrayList<>();
        
        Button btn00 = new Button(" ");
        buttonsList.add(btn00);
        Button btn01 = new Button(" ");
        buttonsList.add(btn01);
        Button btn02 = new Button(" ");
        buttonsList.add(btn02);
        Button btn10 = new Button(" ");
        buttonsList.add(btn10);
        Button btn11 = new Button(" ");
        buttonsList.add(btn11);
        Button btn12 = new Button(" ");
        buttonsList.add(btn12);
        Button btn20 = new Button(" ");
        buttonsList.add(btn20);
        Button btn21 = new Button(" ");
        buttonsList.add(btn21);
        Button btn22 = new Button(" ");
        buttonsList.add(btn22);
        
        for (Button button : buttonsList) {
            button.setFont(Font.font("Monospaced", 40));
            
            int numberq = buttonsList.indexOf(button);
            buttons.add(button, numberq / 3, numberq % 3);
            
            button.setOnAction((event) -> {
                if(" ".equals(button.getText()) && !gameStatus.isFinished()) {
                    button.setText(gameStatus.getTurn().toString());
                    
                    int number = buttonsList.indexOf(button);
                    gameStatus.add(number / 3, number % 3);
                    
                    gameStatus.changeTurn();
                    
                    if (gameStatus.isFinished()) {
                        info.setText("The end!");
                    } else {
                        info.setText("Turn: " + gameStatus.getTurn());
                    }
                }
            });
        }
        
        Scene view = new Scene(layout);
        
        window.setScene(view);
        window.show();
    }
}
