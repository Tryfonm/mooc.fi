package smiley;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class SmileyApplication extends Application {

    public static void main(String[] args) {
        launch(SmileyApplication.class);
    }

    @Override
    public void start(Stage window) {

        Canvas paintingCanvas = new Canvas(640, 480);
        GraphicsContext painter = paintingCanvas.getGraphicsContext2D();

        BorderPane paintingLayout = new BorderPane();
        paintingLayout.setCenter(paintingCanvas);

        for (int x = 0; x < 640; x++) {
            for (int y = 0; y < 480; y++) {
                painter.setFill(Color.WHITE);
                painter.fillRect(x, y, 1, 1);
            }
        }

        for (int x = 200; x < 280; x++) {
            painter.setFill(Color.BLACK);
            painter.fillRect(x, 320, 10, 10);
        }
        painter.setFill(Color.BLACK);
        painter.fillRect(190, 310, 10, 10);
        painter.setFill(Color.BLACK);
        painter.fillRect(180, 300, 10, 10);

        painter.setFill(Color.BLACK);
        painter.fillRect(290, 310, 10, 10);
        painter.setFill(Color.BLACK);
        painter.fillRect(300, 300, 10, 10);

        painter.setFill(Color.BLACK);
        painter.fillRect(165, 200, 40, 40);

        painter.setFill(Color.BLACK);
        painter.fillRect(285, 200, 40, 40);

        painter.setFill(Color.BLACK);

        Scene view = new Scene(paintingLayout);

        window.setScene(view);
        window.show();
    }
}
