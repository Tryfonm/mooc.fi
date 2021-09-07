package notifier;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class NotifierApplication extends Application {

    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }

    @Override
    public void start(Stage window) {
        // Simple Vertical layout
        VBox vbox = new VBox();

        // Text field
        TextField inputText = new TextField();

        // Text output
        Label outputText = new Label();

        // Button
        Button button = new Button("Update");
        button.setOnAction((event) -> outputText.setText(inputText.getText()));

        // Adding the components in the layout (in the right order)
        vbox.getChildren().add(inputText);
        vbox.getChildren().add(button);
        vbox.getChildren().add(outputText);

        // Set scene
        Scene scene = new Scene(vbox);
        window.setScene(scene);
        window.show();
    }
}
