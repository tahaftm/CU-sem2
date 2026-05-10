import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ScenesAndDrawing extends Application {
    public static void main(String[] args) {
        Application.launch((args));
    }
    public void start(Stage stage) throws Exception{
        Group root = new Group();
        Scene scene = new Scene(root,600,600, Color.LIGHTSKYBLUE);

        // Text properties
        Text text = new Text();
        text.setText("TAHA");
        text.setX(50);
        text.setY(50);
        text.setFont(Font.font("Verdana", 50));
        text.setFill(Color.LIMEGREEN);

        // Rectangle
        Rectangle rectangle = new Rectangle();
        rectangle.setX(100);
        rectangle.setY(100);
        rectangle.setWidth(100);
        rectangle.setHeight(100);
        rectangle.setFill(Color.BLUE);
        rectangle.setStrokeWidth(5);
        rectangle.setStroke(Color.BLACK);

        // Line
        Line line = new Line();
        line.setStartX(100);
        line.setStartY(100);
        line.setEndX(200);
        line.setEndY(200);
        line.setFill(Color.BLUE);
        line.setStrokeWidth(5);
        line.setStroke(Color.BLACK);

        // Polygon
        Polygon triangle = new Polygon();
        triangle.getPoints().setAll(
                200.0,200.0,
                300.0,300.0,
                200.0,300.0
        );
        triangle.setFill(Color.YELLOW);

        // Circle
        Circle cirlce = new Circle();
        cirlce.setCenterX(350);
        cirlce.setCenterY(350);
        cirlce.setRadius(50);
        cirlce.setFill(Color.BLUE);

        // Images
        Image image = new Image("icon.jpg");
        ImageView imageView = new ImageView(image);
        imageView.setX(400);
        imageView.setY(400);

        // Add everything to root
        root.getChildren().add(text);
        root.getChildren().add(rectangle);
        root.getChildren().add(line);
        root.getChildren().add(triangle);
        root.getChildren().add(imageView);
        root.getChildren().add(cirlce);

        stage.setScene(scene);
        stage.show();
    }
}
