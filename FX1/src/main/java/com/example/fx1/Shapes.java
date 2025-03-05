package com.example.fx1;

import javafx.animation.AnimationTimer;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.collections.MapChangeListener;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Group;
import javafx.scene.shape.Circle;
import javafx.scene.shape.CubicCurveTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;

import javafx.stage.Stage;
import javafx.util.Duration;

public class Shapes extends Application {
    @Override
    public void start(Stage stage) throws Exception{

       /*Rectangle r1 = new Rectangle(25, 20, 180, 100);
        r1.setStroke(Color.BLACK);
        r1.setFill(Color.WHITE);

        Rectangle r2 = new Rectangle(25, 140, 180, 100);
        r2.setFill(Color.DARKGREY);
        r2.setArcWidth(20);
        r2.setRotate(45);

        Rectangle r3 = new Rectangle(25, 260, 180, 100);
        r3.setArcWidth(15);
        r3.setArcHeight(25);
        r3.setVisible(false);

        Arc arc1 = new Arc(150, 100, 80, 80, 30, 35); // Create an arc
        arc1.setFill(Color.RED); // Set fill color
        arc1.setType(ArcType.ROUND); // Set arc type

        Arc arc2 = new Arc(150, 100, 80, 80, 30 + 90, 35);
        arc2.setFill(Color.AQUAMARINE);
        arc2.setType(ArcType.OPEN);
        arc2.setStroke(Color.BLACK);*/

        Rectangle rectangle = new Rectangle (0, 0, 25, 50);
        Circle circle = new Circle(125, 100, 50);
        PathTransition pt = new PathTransition();
        pt.setDuration(Duration.millis(4000));
        pt.setPath(circle); pt.setNode(rectangle);
        pt.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pt.setCycleCount(Timeline.INDEFINITE); pt.setAutoReverse(true);
        pt.play();

        Group root = new Group(rectangle, circle);
        Scene scene = new Scene(root, 600, 300);
        stage.setTitle("Path Transition Example");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String args[]){
        launch(args);
    }
}

