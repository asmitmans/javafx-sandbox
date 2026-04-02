package com.sandbox.ticTacToe;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TicTacToeApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane layout = new BorderPane();

        // Turn label
        Label turnLabel = new Label("Turn: X");
        turnLabel.setFont(Font.font("Monospaced", 40));
        layout.setTop(turnLabel);

        // Board with GridPane
        GridPane board = new GridPane();
        board.setHgap(10);
        board.setVgap(10);
        board.setPadding(new Insets(10, 10, 20, 10));  
        board.setAlignment(Pos.CENTER);

        // Buttons dinamic creation
        for (int row = 0; row < 3; row++) {
            int r = row;
            for (int col = 0; col < 3; col++) {
                int c = col;

                Button btn = createBoardButton();

                btn.setOnAction((event) -> BoardButtonClickHandler(r, c));

                board.add(btn, col, row);
            }
        }

        layout.setCenter(board);

        Scene view = new Scene(layout, 300, 380);
        stage.setScene(view);
        stage.setTitle("Tic Tac Toe");
        stage.show();
    }

    private Button createBoardButton() {
        Button btn = new Button("");
        btn.setFont(Font.font("Monospaced", 49));
        btn.setPrefSize(80, 80);
        return btn;
    }

    private void BoardButtonClickHandler(int row, int col) {
        System.out.println("Se presiono el btn en la fila: " + row + " col: " + col);
    }

    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
    }


}
