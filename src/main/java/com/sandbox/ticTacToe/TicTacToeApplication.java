package com.sandbox.ticTacToe;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TicTacToeApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        BorderPane layout = new BorderPane();

        HBox menu = new HBox();
        
        Label turnLabel = new Label("Turn: X");
        turnLabel.setFont(Font.font("Monospaced", 40));
        menu.getChildren().addAll(turnLabel);
        layout.setTop(menu);

        GridPane main = new GridPane();

        Button btn00 = new Button();
        btn00.setFont(Font.font("Monospaced", 40));
        Button btn10 = new Button();
        btn10.setFont(Font.font("Monospaced", 40));
        Button btn20 = new Button();
        btn20.setFont(Font.font("Monospaced", 40));

        Button btn01 = new Button();
        btn01.setFont(Font.font("Monospaced", 40));
        Button btn11 = new Button();
        btn11.setFont(Font.font("Monospaced", 40));
        Button btn21 = new Button();
        btn21.setFont(Font.font("Monospaced", 40));

        Button btn02 = new Button();
        btn02.setFont(Font.font("Monospaced", 40));
        Button btn12 = new Button();
        btn12.setFont(Font.font("Monospaced", 40));
        Button btn22 = new Button();
        btn22.setFont(Font.font("Monospaced", 40));

        main.add(btn00, 0, 0);
        main.add(btn10, 1, 0);
        main.add(btn20, 2, 0);

        main.add(btn01, 0, 1);
        main.add(btn11, 1, 1);
        main.add(btn21, 2, 1);

        main.add(btn02, 0, 2);
        main.add(btn12, 1, 2);
        main.add(btn22, 2, 2);

        main.setVgap(10);
        main.setHgap(10);
        

        layout.setCenter(main);

        Scene view = new Scene(layout, 280,320);
        stage.setScene(view);
        stage.show();                
        
    }

    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
    }


}
