package textstatistics;

import java.awt.TextComponent;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TextStatisticsApplication extends Application {

    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

    @Override
    public void start(Stage window) {
        BorderPane layout = new BorderPane();

        TextArea comp1 = new TextArea("");

        HBox comp2 = new HBox();
        comp2.setSpacing(10);
        comp2.getChildren().add(new Label("Letters: 0"));
        comp2.getChildren().add(new Label("Words: 0"));
        comp2.getChildren().add(new Label("The longest word is: "));

        layout.setCenter(comp1);
        layout.setBottom(comp2);

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.show();
    }
}
