package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage){

        Group root = new Group();

        stage.setTitle("Test");
        stage.setResizable(false);
        Scene scene = new Scene(root, 500, 475);
        stage.setScene(scene);

        Canvas canvas = new Canvas(500, 475);
        root.getChildren().add(canvas);
        GraphicsContext context = canvas.getGraphicsContext2D();

        context.setFill(Color.BLUE);
        context.fillOval(50, 50, 60, 60);

        context.setFill(Color.GREEN);
        context.fillRect(150, 50, 50, 60);

        context.setStroke(Color.RED);
        context.strokeLine(400, 400, 450, 350);

        context.strokeLine(300, 300, 350, 350);
        context.strokeLine(350, 350, 350, 250);
        context.strokeLine(350, 250, 400, 200);

        context.setFill(Color.RED);
        context.fillPolygon(
                new double[]{120, 160, 100, 180, 200},
                new double[]{390, 370, 320, 300, 400},
                5
        );

        stage.show();
    }
}