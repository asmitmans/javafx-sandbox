package com.sandbox.demo2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SecondApp extends Application {

    @Override
    public void start(Stage stage) {
        Label label = new Label("Segunda app");
        Button button = new Button("Aceptar");

        VBox root = new VBox(label, button);

        Scene scene = new Scene(root, 320, 200);
        stage.setTitle("App 2");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
