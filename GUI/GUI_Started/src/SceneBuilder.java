import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneBuilder extends Application {
    public static void main() {

    }
    public void start(Stage stage){
        try{
            Parent root = FXMLLoader.load(getClass().getResource("main-view.fxml"));
            Scene scene = new Scene(root,400,400);

//            scene.getStylesheets().add(getClass());

            stage.setScene(scene);
            stage.show();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
