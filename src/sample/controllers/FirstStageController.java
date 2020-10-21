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


    // wczytuje stacje sanepid z pliku
    // zrodlo danych: http://wsse.szczecin.pl/lista-stacji-wojewodzkich/
    List<Station> stacjeSanepid = Tools.getStationsFromFile(Paths.get("src/resources/files/sanepid.txt"));


    // powrot do poprzedniej sceny
    public void backClicked() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/resources/view/Menu.fxml"));

        Stage window = (Stage) buttonBack.getScene().getWindow();
        window.setScene(new Scene(root,1280, 720));
    }


    // przycisk do wyszukania wojewodztwa
    public void findClicked() {

        // domyslne ustawia wartosci pól na puste
        mainInstitution.setText("");
        mainPhoneNumber.setText("");

        // jezeli pole nie jest puste, to moze zadzialac for
        if (!textField.getText().equals("")) {

            // for dla kazdej linijki listy, po wojewodztwie, wpisuje odpowiadajace mu dane
            for (Station stacja: stacjeSanepid
            ) {
                if (stacja.getWojewodztwo().toLowerCase().contains(textField.getText().toLowerCase())) {    // zamienia na male litery zeby nie bylo problemu w szukaniu
                    mainInstitution.setText(stacja.getAdres());
                    mainPhoneNumber.setText(stacja.getTelefon());
                    break;
                }
            }
        }
    }
}