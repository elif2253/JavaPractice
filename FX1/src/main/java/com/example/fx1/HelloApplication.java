package com.example.fx1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
//import javafx.scene.control.Label;
//import javafx.scene.control.TextField;
//import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
//import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        Button btOK = new Button("OK");
        Button btCancel = new Button("Cancel");
        Button btExit = new Button("Exit");

        VBox vBox = new VBox();//root node
        vBox.getChildren().add(btExit);
        vBox.getChildren().addAll(btCancel, btOK);
        vBox.getChildren().remove(btCancel);

        /*Label lbl = new Label("Hello!");
        lbl.setFont(Font.font(24));
        lbl.setMinWidth(60);

        TextField txt = new TextField();
        txt.setMaxWidth(120);*/

        //lbl.textProperty().bind(txt.textProperty());//when the text field changes automatically label changes

        //HBox box = new HBox(20, lbl, txt);// root node HBox (horizontal box)(layout)

        Scene scene = new Scene(vBox, 320, 240);
        stage.setTitle("New Tab Welcome");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}