package application;

import java.util.Scanner;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class PartiesApplication extends Application {

    public static void main(String[] args) {
        launch(PartiesApplication.class);
    }

    public ArrayList<String> readFile(String filename) {
        ArrayList<String> rows = new ArrayList<>();
        int rowCounter = 0;
        try ( Scanner fileScanner = new Scanner(Paths.get("partiesdata.tsv"))) {
            while (fileScanner.hasNextLine()) {
                rows.add(fileScanner.nextLine());
            }
            return rows;

        } catch (Exception e) {
            System.out.println("Error reading the file");
        }
        return null;
    }

    @Override
    public void start(Stage window) {
        int[] years = {0, 1968, 1972, 1976, 1980, 1984, 1988, 1992, 1996, 2000, 2004, 2008};

        NumberAxis xAxis = new NumberAxis(years[1], years[years.length - 1], 1);
        NumberAxis yAxis = new NumberAxis(0, 30, 1);

        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);

        // Printout the file that was loaded
        ArrayList<String> dataset = readFile("partiesdata.tsv");
        dataset.stream()
                .forEach(row -> System.out.println(row));

        for (int row = 1; row < dataset.size(); row++) {

            String[] parts = dataset.get(row).split("\t");
            XYChart.Series dataSeries = new XYChart.Series();
            dataSeries.setName(parts[0]);

            for (int col = 1; col < years.length; col++) {
                if (!(parts[col].contains("-"))) {
                    dataSeries.getData().add(new XYChart.Data(years[col], Double.valueOf(parts[col])));
                }
            }
            lineChart.getData().add(dataSeries);
        }

        Scene view = new Scene(lineChart, 640, 480);

        window.setTitle("title");
        window.setScene(view);
        window.show();
    }
}
