package com.sandbox.app;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) {
        Button button = new Button("Hola JavaFX");
        StackPane root = new StackPane(button);

        Scene scene = new Scene(root, 320, 200);
        stage.setTitle("App 1");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
