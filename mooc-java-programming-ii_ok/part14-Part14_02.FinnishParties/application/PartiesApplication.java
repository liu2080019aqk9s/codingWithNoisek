package application;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class PartiesApplication extends Application{

    public static void main(String[] args) {
        launch(PartiesApplication.class);
    }

    @Override
    public void start(Stage window) {
        NumberAxis xAxis = new NumberAxis(1968, 2008, 4);
        NumberAxis yAxis = new NumberAxis(0, 30, 5);
        
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Relative support of the parties");
        
        Map<String, Map<Integer, Double>> values = new HashMap<>();
        
        List<String> rows = new ArrayList<>();
        try {
            Files.lines(Paths.get("partiesdata.tsv")).forEach(row -> rows.add(row));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        String[] years = rows.get(0).split("\t");
        ArrayList<String> yearsString = new ArrayList<>(Arrays.asList(Arrays.copyOfRange(years, 1, years.length)));
        ArrayList<Integer> yearsList = yearsString.stream()
                .map (year -> Integer.parseInt(year))
                .collect(Collectors.toCollection(ArrayList::new));
        
        rows.remove(0);
        
        rows.stream()
                .map (row -> row.split("\t"))
                .forEach (row -> {
                    ArrayList<String> newRow = new ArrayList<>(Arrays.asList(Arrays.copyOfRange(row, 1, row.length)));
                                       
                    Map<Integer, Double> data = new HashMap<>();
                    
                    for (int i = 0; i < 11; i++) {
                        if(!"-".equals(newRow.get(i))) {
                            data.put(yearsList.get(i), Double.valueOf(newRow.get(i)));
                        }
                    }
                    
                    values.put(row[0], data);
                });
        
        
        values.keySet().stream().forEach(party -> {
            XYChart.Series data = new XYChart.Series();
            
            data.setName(party);
            
            values.get(party).entrySet().stream().forEach(pair -> {
                data.getData().add(new XYChart.Data(pair.getKey(), pair.getValue()));
            });
            
            lineChart.getData().add(data);
        });
        
        Scene view = new Scene(lineChart);
        window.setScene(view);
        window.show();
    }

}
