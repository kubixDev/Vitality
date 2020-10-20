package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {
    // todo spakowac gotowy exe z plikami do zip

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("view/Menu.fxml"));
        primaryStage.setTitle("Vitality");
        primaryStage.setScene(new Scene(root, 1280, 720));
        primaryStage.show();

        // blokowanie resize, ustawienie sceny eliminuje bug
        // https://bugs.openjdk.java.net/browse/JDK-8090028
        primaryStage.setScene(primaryStage.getScene());
        primaryStage.setResizable(false);
        primaryStage.sizeToScene();

        // ustawia logo aplikacji
        primaryStage.getIcons().add(new Image("images/VitalityIcon.png"));
    }


    public static void main(String[] args) {
        launch(args);
    }
}