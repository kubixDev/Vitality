package sample.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.io.IOException;
public class ThirdStageController {

    @FXML
    Button buttonBack;
    @FXML
    Button buttonWell;
    @FXML
    Button buttonUnwell;


    // powrot do poprzedniej sceny
    public void backClicked() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../view/Menu.fxml"));

        Stage window = (Stage) buttonBack.getScene().getWindow();
        window.setScene(new Scene(root,1280, 720));
    }


    // przejscie do sceny dobrego samopoczucia
    public void wellClicked() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../view/WellStage.fxml"));

        Stage window = (Stage) buttonBack.getScene().getWindow();
        window.setScene(new Scene(root,1280, 720));
    }


    // przejscie do sceny zlego samopoczucia
    public void unwellClicked() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../view/UnwellStage.fxml"));

        Stage window = (Stage) buttonBack.getScene().getWindow();
        window.setScene(new Scene(root,1280, 720));
    }
}