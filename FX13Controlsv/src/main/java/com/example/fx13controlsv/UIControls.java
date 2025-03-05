package com.example.fx13controlsv;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class UIControls extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        BorderPane root = new BorderPane();

        Text txt = new Text(50, 50, "Visual Programming Class");
        Pane paneTxt = new Pane();
        paneTxt.getChildren().add(txt);
        root.setCenter(paneTxt);

        Button btnLeft = new Button("Left", new ImageView("file:C:\\Users\\Hp\\IdeaProjects\\FX13Controlsv\\src\\main\\resources\\rightbutton.png"));
        Button btnRight = new Button("Right", new ImageView("file:C:\\Users\\Hp\\IdeaProjects\\FX13Controlsv\\src\\main\\resources\\leftbutton.png"));
        HBox paneButton = new HBox();

        paneButton.getChildren().addAll(btnLeft, btnRight);
        paneButton.setAlignment(Pos.CENTER);
        paneButton.setSpacing(10.0);
        paneButton.setStyle("-fx-border-color: green");
        root.setBottom(paneButton);

        btnLeft.setOnAction(event -> txt.setX(txt.getX() - 10));
        btnRight.setOnAction(event -> txt.setX(txt.getX() + 10));

        VBox pane1 = new VBox();
        CheckBox checkbold = new CheckBox("Bold");
        CheckBox checkitalic = new CheckBox("Italic");
        pane1.setPadding(new Insets(5, 5, 5, 5));
        pane1.setStyle("-fx-border-color: purple");
        pane1.getChildren().addAll(checkitalic, checkbold);
        root.setRight(pane1);

        EventHandler<ActionEvent> checkHandler = event -> {
          if (checkbold.isSelected() && checkitalic.isSelected())
              txt.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.ITALIC, 18));
          else if(checkbold.isSelected())
              txt.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.REGULAR ,18));
          else if (checkitalic.isSelected())
              txt.setFont(Font.font("Arial",FontWeight.NORMAL ,FontPosture.ITALIC, 18));
          else
              txt.setFont(Font.font("Arial", FontWeight.NORMAL, FontPosture.REGULAR, 18));
        };
        checkbold.setOnAction(checkHandler);
        checkitalic.setOnAction(checkHandler);

        VBox paneRadio = new VBox();
        paneRadio.setSpacing(10.0);
        paneRadio.setStyle("-fx-border-color: green");
        paneRadio.setPadding(new Insets(5, 5, 5, 5));
        root.setLeft(paneRadio);

        RadioButton rbBlue = new RadioButton("Blue");
        RadioButton rbRed = new RadioButton("Red");
        RadioButton rbGreen = new RadioButton("Green");

        ToggleGroup group = new ToggleGroup();
        rbBlue.setToggleGroup(group);
        rbRed.setToggleGroup(group);
        rbGreen.setToggleGroup(group);
        paneRadio.getChildren().addAll(rbBlue, rbGreen, rbRed);

        rbBlue.setOnAction(event -> {
                if(rbBlue.isSelected())
                    txt.setFill(Color.BLUE);
        }) ;
        rbRed.setOnAction(event -> {
            if(rbRed.isSelected())
                txt.setFill(Color.RED);
        }) ;
        rbGreen.setOnAction(event -> {
            if(rbGreen.isSelected())
                txt.setFill(Color.GREEN);
        });

        HBox paneField = new HBox();
        paneField.setSpacing(10.0);
        paneField.setStyle("-fx-border-color: green");
        paneField.setPadding(new Insets(5, 5, 5, 5));
        Label lbl = new Label("New Text");
        TextField textField = new TextField();
        textField.setPrefColumnCount(60);

        paneField.getChildren().addAll(lbl, textField);
        root.setTop(paneField);

        textField.setOnAction(event -> txt.setText(textField.getText()));

        Scene scene = new Scene(root, 800, 500);
        stage.setTitle("UI Controls is working ?");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}