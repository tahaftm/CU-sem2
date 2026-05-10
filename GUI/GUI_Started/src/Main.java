import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    public void start(Stage stage) throws Exception{

        // Determines the things you need to add to scene
        Group root = new Group();

        // A part of stage(window) which consist of any content.
        Scene scene = new Scene(root, Color.BLACK);

        // Telling the stage we have the scene
        stage.setScene(scene);

        // Creating an image
        Image icon = new Image("icon.jpg");

        // stage properties and methods
        stage.getIcons().add(icon);
        stage.setTitle("first Javafx");
        stage.setWidth(420);
        stage.setHeight(420);
        stage.setResizable(false);
//        stage.setX(50);
//        stage.setX(50);
        stage.setFullScreen(true);
        stage.setFullScreenExitHint("You cant escape unless you press q");
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));

        // Display stage
        stage.show();
    }
}