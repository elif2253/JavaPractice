package com.example.eventpracticebymyself;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class CircleController extends Application {

    @Override
    public void start(Stage stage) throws Exception{

        Pane root = new Pane();

        Circle circle = new Circle(100, 100, 50);
        circle.setFill(Color.DARKSALMON);
        circle.setFocusTraversable(true);

        circle.setOnMouseClicked(event -> circle.requestFocus());
        circle.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                circle.setCenterX(mouseEvent.getX());
                circle.setCenterY(mouseEvent.getY());
            }
        });

        circle.setOnKeyPressed((KeyEvent event) -> {
            switch (event.getCode()){
                case UP : circle.setCenterY(circle.getCenterY() - 10);break;
                case DOWN: circle.setCenterY(circle.getCenterY() + 10);break;
                case LEFT: circle.setCenterX(circle.getCenterX() - 10);break;
                case RIGHT: circle.setCenterX(circle.getCenterX() + 10);break;
            }
        });

       /* circle.setOnMouseDragged( event ->{
            circle.setCenterX(mouseEvent.getX());
            circle.setCenterY(mouseEvent.getY());
        });*/

        root.getChildren().add(circle);
        Scene scene = new Scene(root, 500, 500);
        stage.setTitle("Click controller is working ?");
        stage.setScene(scene);
        stage.show();
    }
}
