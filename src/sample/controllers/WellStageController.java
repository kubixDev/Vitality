package sample.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import sample.model.Quote;
import sample.tools.Tools;


import java.io.IOException;
import java.util.List;
import java.util.Random;

public class WellStageController {

    @FXML
    Button buttonBack;
    @FXML
    Button buttonNextQuote;
    @FXML
    Label quoteLabel;
    @FXML
    Label personLabel;

    // wczytuje cytaty z pliku tekstowego
    List<Quote> cytaty = Tools.getQuoteFromFile("cytaty.txt");


    // powrot do poprzedniej sceny
    public void backClicked() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../view/ThirdStage.fxml"));

        Stage window = (Stage) buttonBack.getScene().getWindow();
        window.setScene(new Scene(root,1280, 720));
    }


    // po nacisnieciu przucisku losuje cytat
    // zrodlo cytatow: Forbes, Wikiquotes (tlumaczone)
    public void quoteClicked() {
        Random random = new Random();
        Quote randomQuote = cytaty.get(random.nextInt(cytaty.size()));
        quoteLabel.setText(randomQuote.getCytat());
        personLabel.setText(randomQuote.getOsoba());
    }
}