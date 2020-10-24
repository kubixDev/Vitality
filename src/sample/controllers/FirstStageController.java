package sample.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sample.model.Station;
import sample.tools.Tools;

import java.io.*;
import java.nio.file.Paths;
import java.util.List;


public class FirstStageController {

    @FXML
    Button buttonBack;
    @FXML
    Button buttonFind;
    @FXML
    TextField textField;
    @FXML
    Label mainInstitution;
    @FXML
    Label mainPhoneNumber;

    // zrodlo danych: http://wsse.szczecin.pl/lista-stacji-wojewodzkich/
    List<Station> stacjeSanepid = Tools.getStationsFromFile(Paths.get("src/resources/files/sanepid.txt"));


    public void backClicked() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/resources/view/Menu.fxml"));

        Stage window = (Stage) buttonBack.getScene().getWindow();
        window.setScene(new Scene(root,1280, 720));
    }


    public void findClicked() {
        mainInstitution.setText("");
        mainPhoneNumber.setText("");

        if (!textField.getText().equals("")) {
            for (Station stacja: stacjeSanepid
            ) {
                if (stacja.getWojewodztwo().toLowerCase().contains(textField.getText().toLowerCase())) {
                    mainInstitution.setText(stacja.getAdres());
                    mainPhoneNumber.setText(stacja.getTelefon());
                    break;
                }

                else {
                    mainInstitution.setText("brak danych");
                    mainPhoneNumber.setText("brak danych");
                }
            }
        }
    }
}