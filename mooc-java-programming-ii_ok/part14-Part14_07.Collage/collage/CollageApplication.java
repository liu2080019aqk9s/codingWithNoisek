package collage;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelReader;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class CollageApplication extends Application {

    @Override
    public void start(Stage stage) {

        Image sourceImage = new Image("file:monalisa.png");

        PixelReader imageReader = sourceImage.getPixelReader();

        int width = (int) sourceImage.getWidth();
        int height = (int) sourceImage.getHeight();

        WritableImage targetImage = new WritableImage(width, height);
        PixelWriter imageWriter = targetImage.getPixelWriter();

        int yCoordinate = 0;
        while (yCoordinate < height / 2) {
            int xCoordinate = 0;
            while (xCoordinate < width / 2) {

                Color color = imageReader.getColor(xCoordinate * 2, yCoordinate * 2);
                double red = color.getRed();
                double green = color.getGreen();
                double blue = color.getBlue();
                double opacity = color.getOpacity();

                Color newColor = new Color(1.0 - red, 1.0 - green, 1.0 - blue, opacity);

                imageWriter.setColor(xCoordinate, yCoordinate, newColor);
                imageWriter.setColor(xCoordinate + width / 2, yCoordinate, newColor);
                imageWriter.setColor(xCoordinate, yCoordinate + height / 2, newColor);
                imageWriter.setColor(xCoordinate + width / 2, yCoordinate + height / 2, newColor);

                xCoordinate++;
            }

            yCoordinate++;
        }

        ImageView image = new ImageView(targetImage);

        Pane pane = new Pane();
        pane.getChildren().add(image);

        stage.setScene(new Scene(pane));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
