package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(MultipleViews.class);
    }

    @Override
    public void start(Stage window) {
        
        BorderPane firstLayout = new BorderPane();
        VBox secondLayout = new VBox();
        GridPane thirdLayout = new GridPane();
        Scene firstView = new Scene(firstLayout);
        Scene secondView = new Scene(secondLayout);
        Scene thirdView = new Scene(thirdLayout);
        
        firstLayout.setTop(new Label("First view!"));
        Button firstButton = new Button("To the second view!");
        firstLayout.setCenter(firstButton);
        firstButton.setOnAction((event) -> window.setScene(secondView));
        
        Button secondButton = new Button("To the third view!");
        secondLayout.getChildren().addAll(secondButton, new Label("Second view!"));
        secondButton.setOnAction((event) -> window.setScene(thirdView));
        
        thirdLayout.add(new Label("Third view!"), 0, 0);
        Button thirdButton = new Button("To the first view!");
        thirdLayout.add(thirdButton, 1, 1);
        thirdButton.setOnAction((event) -> window.setScene(firstView));
        
        window.setScene(firstView);
        window.show();
    }

}
