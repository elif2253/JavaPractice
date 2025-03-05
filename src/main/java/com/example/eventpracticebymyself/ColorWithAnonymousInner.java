package com.example.eventpracticebymyself;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;

public class ColorWithAnonymousInner extends Application{
    private Label lbl;

@Override
public void start(Stage stage) throws IOException {

    VBox root = new VBox();
    Button btnClick = new Button("Click me");
    Scene scene = new Scene(root, 320, 240);

    lbl = new Label("This is a label");
    lbl.setFont(Font.font(24));

    btnClick.setOnAction(new EventHandler<ActionEvent>() {
        public void handle(ActionEvent event) {
            double red = Math.random();
            double blue = Math.random();
            double green = Math.random();
            Color color = Color.color(red, green, blue);
            lbl.setTextFill(color);
        }
    });

    root.getChildren().addAll(lbl, btnClick);
    root.setSpacing(10.0);
    root.setAlignment(Pos.TOP_CENTER);

    stage.setTitle("Inner class is working?");
    stage.setScene(scene);
    stage.show();

}


public static void main(String[] args) {
    launch();
}

}

