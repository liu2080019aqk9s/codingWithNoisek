package buttonandtextfield;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class ButtonAndTextFieldApplication extends Application{


    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(ButtonAndTextFieldApplication.class);
    }

    @Override
    public void start(Stage window){
        Button newButton = new Button("2nd button");
        TextField newTextField = new TextField("1st text field");
        
        FlowPane componentGroup = new FlowPane();
        componentGroup.getChildren().add(newButton);
        componentGroup.getChildren().add(newTextField);
        
        Scene view = new Scene(componentGroup);
        window.setScene(view);
        window.show();
    }

}
