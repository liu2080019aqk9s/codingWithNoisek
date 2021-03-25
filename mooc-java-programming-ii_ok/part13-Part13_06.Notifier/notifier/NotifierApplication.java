package notifier;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class NotifierApplication extends Application{


    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(NotifierApplication.class);
    }

    @Override
    public void start(Stage window) {
        VBox layout = new VBox();
        layout.setSpacing(10);
        TextField textField = new TextField("Text to be copied.");
        Button button = new Button("copying");
        Label label = new Label("copied text");
        
        button.setOnAction((event -> label.setText(textField.getText())));
        
        layout.getChildren().addAll(textField, button, label);
        
        Scene view = new Scene(layout);
        window.setScene(view);
        window.show();
    }

}
