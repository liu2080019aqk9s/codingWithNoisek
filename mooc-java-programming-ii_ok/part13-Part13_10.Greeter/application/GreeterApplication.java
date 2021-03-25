package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GreeterApplication extends Application{


    public static void main(String[] args) {
        System.out.println("Hellow world! :3");
        launch(GreeterApplication.class);
    }

    @Override
    public void start(Stage window) {
        
        GridPane inputLayout = new GridPane();
        TextField name = new TextField("");
        Button button = new Button("Start");
        inputLayout.add(new Label("Enter your name and start"), 0, 0);
        inputLayout.add(name, 0, 1);
        inputLayout.add(button, 0, 2);
        inputLayout.setPrefSize(300, 180);
        inputLayout.setAlignment(Pos.CENTER);
        inputLayout.setVgap(10);
        inputLayout.setHgap(10);
        inputLayout.setPadding(new Insets(20, 20, 20, 20));
        
        Scene inputView = new Scene(inputLayout);
        
        Label welcomeText = new Label("");
        StackPane welcomeLayout = new StackPane();
        welcomeLayout.setPrefSize(300, 180);
        welcomeLayout.getChildren().add(welcomeText);
        welcomeLayout.setAlignment(Pos.CENTER);
        
        Scene welcomeView = new Scene(welcomeLayout);
        
        button.setOnAction((event) -> {
            welcomeText.setText("Welcome " + name.getText() + "!");
            window.setScene(welcomeView);
        });
        
        window.setScene(inputView);
        window.show();
    }
}
