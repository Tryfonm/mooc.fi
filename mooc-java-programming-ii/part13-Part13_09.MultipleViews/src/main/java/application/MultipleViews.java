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

    @Override
    public void start(Stage windows) {

        BorderPane layout1 = new BorderPane();
        Label t1 = new Label("First view!");
        Button b1 = new Button("To the second view!");
        layout1.setTop(t1);
        layout1.setCenter(b1);

        VBox layout2 = new VBox();
        Button b2 = new Button("To the third view!");
        layout2.getChildren().add(b2);
        layout2.getChildren().add(new Label("Second view!"));

        GridPane layout3 = new GridPane();
        layout3.add(new Label("Third view!"), 0, 0);
        Button b3 = new Button("To the first view!");
        layout3.add(b3, 1, 1);

        Scene scene1 = new Scene(layout1);
        Scene scene2 = new Scene(layout2);
        Scene scene3 = new Scene(layout3);

        b1.setOnAction((event) -> {
            windows.setScene(scene2);
        });
        b2.setOnAction((event) -> {
            windows.setScene(scene3);
        });
        b3.setOnAction((event) -> {
            windows.setScene(scene1);
        });

        windows.setScene(scene1);
        windows.show();
    }

    public static void main(String[] args) {
        launch(MultipleViews.class);
    }

}
