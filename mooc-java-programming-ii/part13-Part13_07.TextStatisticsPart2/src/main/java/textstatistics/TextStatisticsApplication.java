package textstatistics;

import java.awt.TextComponent;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.Arrays;

public class TextStatisticsApplication extends Application {

    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

    @Override
    public void start(Stage window) {
        
        BorderPane layout = new BorderPane();
        
        TextArea comp1 = new TextArea("");
        Label lettersCount = new Label("Letters: 0");
        Label wordsCount = new Label("Words: 0");
        Label longestWord = new Label("The longest word is: ");

        // OnChange listener
        comp1.textProperty().addListener((change, oldValue, newValue) -> {
            int characters = newValue.length();
            String[] parts = newValue.split(" ");
            int words = parts.length;
            String longest = Arrays.stream(parts)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();
            lettersCount.setText("Letters: " + characters);
            wordsCount.setText("Words: " + words);
            longestWord.setText("The longest word is: " + longest);
        });

        HBox comp2 = new HBox();
        comp2.getChildren().add(lettersCount);
        comp2.getChildren().add(wordsCount);
        comp2.getChildren().add(longestWord);
        comp2.setSpacing(10);

        layout.setCenter(comp1);
        layout.setBottom(comp2);

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.setTitle("Count words app");
        window.show();
    }
}
