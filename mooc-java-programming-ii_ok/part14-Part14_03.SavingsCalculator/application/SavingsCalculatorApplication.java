package application;

import java.util.HashMap;
import java.util.Map;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SavingsCalculatorApplication extends Application{

    public static void main(String[] args) {
        launch(SavingsCalculatorApplication.class);
    }
    
    @Override
    public void start(Stage window) {
        BorderPane layout = new BorderPane();
        
        NumberAxis xAxis = new NumberAxis(0, 30, 1);
        NumberAxis yAxis = new NumberAxis();
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Savings");
        layout.setCenter(lineChart);
        
//        XYChart.Series data = new XYChart.Series();   
//        lineChart.getData().add(data);
//        savingsList(25.0).entrySet().stream().forEach(pair -> {
//            data.getData().add(new XYChart.Data(pair.getKey(), pair.getValue()));
//        });
//        XYChart.Series intrestData = new XYChart.Series();   
//        lineChart.getData().add(intrestData);
//        intrestList(25.0, 0.0).entrySet().stream().forEach(pair -> {
//            intrestData.getData().add(new XYChart.Data(pair.getKey(), pair.getValue()));
//        });
        
        VBox topLayout = new VBox();
        topLayout.setPadding(new Insets(20, 20, 20, 20));
        layout.setTop(topLayout);
        
        BorderPane monthlySavingLayout = new BorderPane();
        monthlySavingLayout.setPadding(new Insets(20, 20, 20, 20));
        BorderPane intrestrateLayout = new BorderPane();
        intrestrateLayout.setPadding(new Insets(20, 20, 20, 20));
        topLayout.getChildren().addAll(monthlySavingLayout, intrestrateLayout);
        
        monthlySavingLayout.setLeft(new Label("Monthly savings"));
        Slider sliderMS = new Slider(25, 250, 25);
        sliderMS.setShowTickLabels(true);
        sliderMS.setShowTickMarks(true);
        sliderMS.setMajorTickUnit(25);
        sliderMS.setBlockIncrement(4);
        monthlySavingLayout.setCenter(sliderMS);
        Label savings = new Label("25");
        monthlySavingLayout.setRight(savings);
//        
//        sliderMS.valueProperty().addListener((obs, oldval, newVal) ->
//            sliderMS.setValue(Math.round(100*newVal.doubleValue())/100.0));
//        sliderMS.setOnMouseDragged((event) -> savings.setText(String.valueOf(sliderMS.getValue())));
        
        intrestrateLayout.setLeft(new Label("Yearly interest rate"));
        Slider sliderYI = new Slider(0, 10, 0);
        sliderYI.setShowTickLabels(true);
        sliderYI.setShowTickMarks(true);
        sliderYI.setMajorTickUnit(10);
        intrestrateLayout.setCenter(sliderYI);
        Label intrest = new Label("0");
        intrestrateLayout.setRight(intrest);
//        
//        sliderYI.valueProperty().addListener((obs, oldval, newVal) ->
//            sliderYI.setValue(Math.round(100*newVal.doubleValue())/100.0));
//        sliderYI.setOnMouseDragged((event) -> intrest.setText(String.valueOf(sliderYI.getValue())));
        
//        sliderMS.setOnMouseReleased((event) -> {
//            data.getData().clear();
//            Map<Integer, Double> values = savingsList(sliderMS.getValue());
//            values.entrySet().stream().forEach(pair -> {
//                data.getData().add(new XYChart.Data(pair.getKey(), pair.getValue()));
//            });
//            intrestData.getData().clear();
//            Map<Integer, Double> intrestValues = intrestList(sliderMS.getValue(), sliderYI.getValue());
//            intrestValues.entrySet().stream().forEach(pair -> {
//                intrestData.getData().add(new XYChart.Data(pair.getKey(), pair.getValue()));
//            });
//        });
//        sliderYI.setOnMouseReleased((event) -> {
//            data.getData().clear();
//            Map<Integer, Double> values = savingsList(sliderMS.getValue());
//            values.entrySet().stream().forEach(pair -> {
//                data.getData().add(new XYChart.Data(pair.getKey(), pair.getValue()));
//            });
//            intrestData.getData().clear();
//            Map<Integer, Double> intrestValues = intrestList(sliderMS.getValue(), sliderYI.getValue());
//            intrestValues.entrySet().stream().forEach(pair -> {
//                intrestData.getData().add(new XYChart.Data(pair.getKey(), pair.getValue()));
//            });
//        });
        
        Scene view = new Scene(layout);
        window.setScene(view);
        window.show();
    }
    
    private Map<Integer, Double> savingsList(Double savings) {
        Map<Integer, Double> savingsList = new HashMap<>();
        
        for (int i = 0; i < 31; i++) {
            savingsList.put(i, savings * i * 12);
        }
        
        return savingsList;
    }
    
    private Map<Integer, Double> intrestList(Double savings, Double intrest) {
        Map<Integer, Double> intrestList = new HashMap<>();
        Double value = 0.0;
        
        for (int i = 0; i < 31; i++) {
            intrestList.put(i, value);
            value = (1 + intrest/100) * (value + savings * 12);
        }
        
        return intrestList;
    }
    

}
