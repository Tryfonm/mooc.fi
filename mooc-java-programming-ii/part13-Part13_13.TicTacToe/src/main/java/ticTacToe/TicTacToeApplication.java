package ticTacToe;

import javafx.application.Application;
import javafx.scene.text.Font;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TicTacToeApplication extends Application {

    private String currentPlayer;
    private Label turnInfo;
    private String winner;
    private boolean gameIsOver;

    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
    }

    @Override
    public void start(Stage window) {

        BorderPane bLayout = new BorderPane();
        winner = null;
        gameIsOver = false;
        turnInfo = new Label("Turn: X");

        GridPane boardGrid = new GridPane();
        boardGrid.setVgap(10);
        boardGrid.setHgap(10);
        boardGrid.setPadding(new Insets(20, 20, 20, 20));

        Button[][] buttons = new Button[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j] = new Button(" ");
                buttons[i][j].setFont(Font.font("Monospaced", 40));
                boardGrid.add(buttons[i][j], i, j);
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttonPressed(buttons, i, j);
            }
        }

        // Adding components to the BorderPane
        bLayout.setTop(turnInfo);
        bLayout.setCenter(boardGrid);

        Scene initialScene = new Scene(bLayout); //**args for intial dimension

        window.setScene(initialScene);
        window.setTitle("TicTacToe window");
        window.show();
    }

    public void findVerticalWinner(Button[][] buttons) {
        for (int i = 0; i < 3; i++) {
            if (buttons[i][0].getText() == buttons[i][1].getText()
                    && buttons[i][1].getText() == buttons[i][2].getText()
                    && buttons[i][0].getText() != " ") {
                winner = buttons[i][0].getText();
                System.out.println("VERTICAL WINNER");
            }
        }
    }

    public void findHorizontalWinner(Button[][] buttons) {
        for (int i = 0; i < 3; i++) {
            if (buttons[0][i].getText() == buttons[1][i].getText()
                    && buttons[1][i].getText() == buttons[2][i].getText()
                    && buttons[0][i].getText() != " ") {
                winner = buttons[0][i].getText();
                System.out.println("HORIZONTAL WINNER");
            }
        }
    }

    public void findDiagonalWinner(Button[][] buttons) {
        if (buttons[0][0].getText() == buttons[1][1].getText()
                && buttons[0][0].getText() == buttons[2][2].getText()
                && buttons[0][0].getText() != " ") {
            System.out.println("DIAGONAL WINNER");
            winner = buttons[0][0].getText();
        }
        if (buttons[2][0].getText() == buttons[1][1].getText()
                && buttons[2][0].getText() == buttons[0][2].getText()
                && buttons[2][0].getText() != " ") {
            System.out.println("DIAGONAL WINNER");
            winner = buttons[2][0].getText();
        }

    }

    public void checkIfTheGameIsOver(Button[][] buttons) {

        // Check if there are any empty celss
        boolean emptyCellExists = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (buttons[i][j].getText() == " ") {
                    emptyCellExists = true;
                }
            }
        }

        // Find if there is a winner 
        findVerticalWinner(buttons);
        findHorizontalWinner(buttons);
        findDiagonalWinner(buttons);

        if (winner != null) {
            turnInfo.setText("The end!");
            gameIsOver = true;
        }
    }

    public void buttonPressed(Button[][] buttons, int i, int j) {
        int c = 0;
        buttons[i][j].setOnAction(event -> {
            if (gameIsOver == false) {
                // System.out.println("echo 1");
                if (buttons[i][j].getText().equals(" ")) {
                    // System.out.println("echo 2");

                    if (currentPlayer == "O") {
                        // System.out.println("echo 3");
                        buttons[i][j].setText("O");
                        currentPlayer = "X";
                        turnInfo.setText("Turn: " + currentPlayer);

                    } else {
                        // System.out.println("echo 4");
                        buttons[i][j].setText("X");
                        currentPlayer = "O";
                        turnInfo.setText("Turn: " + currentPlayer);

                    }
                    checkIfTheGameIsOver(buttons);
                }
            }
        });
    }
}
