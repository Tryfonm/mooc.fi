package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.control.TextField;

public class GreeterApplication extends Application {

    static String userInput;

    public static void main(String[] args) {
        launch(GreeterApplication.class);
    }

    @Override
    public void start(Stage window) {

        // Create components that will be used
        Label text1 = new Label("Enter your name and start.");
        TextField textField = new TextField();
        Button button1 = new Button("Start");

        //// Layout1
        // Create layout and adding components to it for the first view
        GridPane layout1 = new GridPane();
        layout1.add(text1, 0, 0);
        layout1.add(textField, 0, 1);
        layout1.add(button1, 0, 3);

        // Style the layout
        layout1.setPrefSize(300, 180);
        layout1.setAlignment(Pos.CENTER);
        layout1.setVgap(10);
        layout1.setHgap(10);
        layout1.setPadding(new Insets(20, 20, 20, 20));

        //// Layout2
        // Create layout and adding components to it for the second view
        StackPane layout2 = new StackPane();
        layout2.setPrefSize(300, 180);
        Label message = new Label();

        layout2.getChildren().add(message);
        layout2.setAlignment(Pos.CENTER);

        // Create the Scene (View)
        Scene scene1 = new Scene(layout1);
        Scene scene2 = new Scene(layout2);

        // Event handler
        button1.setOnAction(event -> {
            message.setText("Welcome " + textField.getText() + "!");
            window.setScene(scene2);;
        });

        window.setScene(scene1);
        window.show();
    }
}
