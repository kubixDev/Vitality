package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/resources/view/Menu.fxml"));
        primaryStage.setTitle("Vitality");
        primaryStage.setScene(new Scene(root, 1280, 720));
        primaryStage.show();

        primaryStage.setScene(primaryStage.getScene());
        primaryStage.setResizable(false);
        primaryStage.sizeToScene();

        primaryStage.getIcons().add(new Image("/resources/images/VitalityIcon.png"));
    }

    public static void main(String[] args) {
        launch(args);
    }
}