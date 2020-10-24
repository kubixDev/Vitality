package sample.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import sample.model.Quote;
import sample.model.Station;
import sample.tools.Tools;


import java.io.IOException;
import java.nio.file.Paths;
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


    List<Quote> cytaty = Tools.getQuoteFromFile(Paths.get("src/resources/files/quotes.txt"));


    public void backClicked() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/resources/view/ThirdStage.fxml"));

        Stage window = (Stage) buttonBack.getScene().getWindow();
        window.setScene(new Scene(root,1280, 720));
    }


    public void quoteClicked() {
        Random random = new Random();
        Quote randomQuote = cytaty.get(random.nextInt(cytaty.size()));
        quoteLabel.setText(randomQuote.getCytat());
        personLabel.setText(randomQuote.getOsoba());
    }
}