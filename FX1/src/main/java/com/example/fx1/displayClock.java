package com.example.fx1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class displayClock extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        ClockPane clock = new ClockPane();

        BorderPane root = new BorderPane();
        root.setCenter(clock);

        Scene scene = new Scene(root, 500,500);
        stage.setScene(scene);
        stage.setTitle("Clock");
        stage.show();
    }
}
