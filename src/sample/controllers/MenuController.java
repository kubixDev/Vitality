package sample.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuController {
    @FXML
    Button button1;
    @FXML
    Button button2;
    @FXML
    Button button3;
    @FXML
    Button button4;


    // przycisk przechodzacy do centrum informacji (FirstStage)
    public void OneClicked() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/resources/view/FirstStage.fxml"));

        Stage window = (Stage) button1.getScene().getWindow();
        window.setScene(new Scene(root,1280, 720));
    }


    // przycisk przechodzacy do testu na objwy covid (SecondStage)
    public void TwoClicked() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/resources/view/SecondStage.fxml"));

        Stage window = (Stage) button1.getScene().getWindow();
        window.setScene(new Scene(root,1280, 720));
    }


    // przycisk przechodzacy do wsparcia emocjonalnego (ThirdStage)
    public void ThreeClicked() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/resources/view/ThirdStage.fxml"));

            Stage window = (Stage) button1.getScene().getWindow();
            window.setScene(new Scene(root,1280, 720));
    }


    // przycisk przechodzacy do statystyk (FourthStage)
    public void FourClicked() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/resources/view/FourthStage.fxml"));

        Stage window = (Stage) button1.getScene().getWindow();
        window.setScene(new Scene(root,1280, 720));
    }
}