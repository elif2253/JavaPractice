package com.example.eventpracticebymyself;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;

public class ColorChanger extends Application {
    @Override
    public void start(Stage stage) throws IOException {

       VBox root = new VBox();
        Button btnClick = new Button("Click me");
        Scene scene = new Scene(root, 320, 240);

        Label lbl = new Label("This is a label");
        lbl.setPadding(new Insets(20, 20, 20, 20));//kenarlarından bosluk bırakmak icin
        lbl.setBackground(Background.fill(Color.SLATEGRAY));
        lbl.setFont(Font.font(24));

        ClickHandler handler1 = new ClickHandler(lbl);
        btnClick.setOnAction(handler1);
        root.getChildren().addAll(lbl ,btnClick);
        root.setSpacing(10.0);
        root.setAlignment(Pos.TOP_CENTER);

        stage.setTitle("Click Handler is working?");
        stage.setScene(scene);
        stage.show();
    }

    static class ClickHandler implements EventHandler<ActionEvent> {

        private Label lbl;
        public ClickHandler(Label lbl){
            this.lbl = lbl;
        }
        @Override
        public void handle(ActionEvent e){
            System.out.println("Button is clicked!");
            int red = (int)(Math.random() * 256);
            int blue = (int)(Math.random() * 256);
            int green = (int)(Math.random() * 256);
            Color color = Color.rgb(red, green, blue);
            lbl.setTextFill(color);
        }
    }

    public static void main(String[] args) {
        launch();
    }
}