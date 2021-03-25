package textstatistics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;


public class TextStatisticsApplication extends Application{


    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(TextStatisticsApplication.class);
    }

    @Override
    public void start(Stage window) {
        
        BorderPane layout = new BorderPane();
        
        layout.setCenter(new TextArea("2nd text area"));
        HBox bottomLayout = new HBox();
        bottomLayout.setSpacing(10);
        bottomLayout.getChildren().add(new Label("Letters: 0"));
        bottomLayout.getChildren().add(new Label("Words: 0"));
        bottomLayout.getChildren().add(new Label("The longest word is:"));
        
        layout.setBottom(bottomLayout);
        
        Scene view = new Scene(layout);
        window.setScene(view);
        
        window.show();
    }

}
