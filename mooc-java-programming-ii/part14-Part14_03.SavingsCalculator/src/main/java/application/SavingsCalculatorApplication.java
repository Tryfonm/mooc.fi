package application;

import javafx.application.Application;
import javafx.event.EventType;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.beans.binding.Bindings;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SavingsCalculatorApplication extends Application {

    public static void main(String[] args) {
        launch(SavingsCalculatorApplication.class);
    }

    @Override
    public void start(Stage window) {
        BorderPane layout = new BorderPane();

        VBox vbox = new VBox();

        // 1.1.1 Slider on top - Monthly savings
        BorderPane borderPane1 = new BorderPane();
        Label labelText1 = new Label("Monthly savings");
        Slider slider1 = new Slider(25, 250, 25);
        slider1.setShowTickMarks(true);
        slider1.setShowTickLabels(true);
        slider1.valueProperty().addListener((obs, oldval, newVal)
                -> slider1.setValue(newVal.intValue()));
        Label labelValue1 = new Label(String.valueOf(slider1.getValue()));
        labelValue1.textProperty().bind(
                Bindings.format(
                        "%.0f",
                        slider1.valueProperty())
        );
        borderPane1.setLeft(labelText1);
        borderPane1.setCenter(slider1);
        borderPane1.setRight(labelValue1);

        // 1.1.2 Slider on bottom - Yearly interest rate
        BorderPane borderPane2 = new BorderPane();
        Label labelText2 = new Label("Yearly interest rate");
        Slider slider2 = new Slider(0, 10, 0);
        slider2.setShowTickMarks(true);
        slider2.setShowTickLabels(true);
        slider2.valueProperty().addListener((obs, oldval, newVal)
                -> slider2.setValue(newVal.intValue()));
        Label labelValue2 = new Label(String.valueOf(slider1.getValue()));
        labelValue2.textProperty().bind(
                Bindings.format(
                        "%.0f",
                        slider2.valueProperty())
        );
        borderPane2.setLeft(labelText2);
        borderPane2.setCenter(slider2);
        borderPane2.setRight(labelValue2);

        XYChart.Series dataSeries1 = new XYChart.Series();
        dataSeries1.setName("Without Ineterest");
        XYChart.Series dataSeries2 = new XYChart.Series();
        dataSeries2.setName("With Ineterest");

        for (int i = 0; i <= 31; i++) {
            dataSeries1.getData().add(new XYChart.Data(i, 25 * i * 12));
        }

        slider1.valueProperty().addListener((change, oldValue, newValue) -> {
            dataSeries1.getData().clear();
            dataSeries2.getData().clear();

            for (int i = 0; i <= 31; i++) {
                dataSeries1.getData().add(new XYChart.Data(i, newValue.intValue() * i * 12));
                dataSeries2.getData().add(new XYChart.Data(i, computeSavingWithInterest(i, (int) slider2.getValue(), newValue.intValue())));
            }
        });

        for (int i = 0; i <= 31; i++) {
            dataSeries2.getData().add(new XYChart.Data(i, computeSavingWithInterest(i, 0, 25)));
        }
        slider2.valueProperty().addListener((change, oldValue, newValue) -> {
            dataSeries2.getData().clear();
            for (int i = 0; i <= 31; i++) {
                dataSeries2.getData().add(new XYChart.Data(i, computeSavingWithInterest(i, newValue.intValue(), slider1.getValue())));
            }
        });
        vbox.getChildren().addAll(borderPane1, borderPane2);

        NumberAxis xAxis = new NumberAxis(0, 30, 1);
        NumberAxis yAxis = new NumberAxis();

        LineChart lineChart = new LineChart(xAxis, yAxis);

        lineChart.getData().add(dataSeries1);
        lineChart.getData().add(dataSeries2);

        // Adding both layouts in the Overall layout
        layout.setCenter(lineChart);
        layout.setTop(vbox);

        Scene scene = new Scene(layout, 960, 600);
        window.setScene(scene);
        window.show();
    }

    public BorderPane createBorderPane(int sliderMin, int sliderMax, String labelText) {
        BorderPane borderPane = new BorderPane();
        Label l1 = new Label(labelText);
        Slider slider = new Slider(sliderMin, sliderMax, sliderMin);
        slider.setShowTickMarks(true);
        slider.setShowTickLabels(true);
        Label l2 = new Label(String.valueOf(slider.getValue()));

        borderPane.setLeft(l1);
        borderPane.setCenter(slider);
        borderPane.setRight(l2);

        l2.textProperty().addListener((change, oldValue, newValue) -> {
            System.out.println("echo1");
        });
        return borderPane;
    }

    public double computeSavingWithInterest(int year, int interest, double savings) {
        double returns = 0;
        savings = savings * 12;
        for (int i = 0; i < year; i++) {
            returns = (savings + (returns)) * (0.01 * interest + 1);
        }
        return returns;
    }
}
