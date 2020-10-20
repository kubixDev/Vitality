package sample.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import sample.model.MentalHelp;
import sample.tools.Tools;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UnwellStageController {

    @FXML
    Button buttonBack;
    @FXML
    Button anxiousButton;
    @FXML
    Button infectedButton;
    @FXML
    Button productivityButton;
    @FXML
    Button lonelyButton;
    @FXML
    Button otherHelp;
    @FXML
    Label helpLabel;


    // wczytuje pomoc z pliku tekstowego
    List<MentalHelp> mentalHelpList = Tools.getHelpFromFile("wsparcieEmocjonalne.txt");


    // powrot do poprzedniej sceny
    public void backClicked() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../view/ThirdStage.fxml"));

        Stage window = (Stage) buttonBack.getScene().getWindow();
        window.setScene(new Scene(root,1280, 720));
    }


    // przyciski z powszechnymi problemami
    public void anxiousClicked() {
        for (MentalHelp help: mentalHelpList
             ) {
            if (help.getType().equals("anxious")) {
                helpLabel.setText(help.getContents());
            }
        }
    }

    public void infectedClicked() {
        for (MentalHelp help: mentalHelpList
        ) {
            if (help.getType().equals("infected")) {
                helpLabel.setText(help.getContents());
            }
        }
    }

    public void productivityClicked() {
        for (MentalHelp help: mentalHelpList
        ) {
            if (help.getType().equals("productivity")) {
                helpLabel.setText(help.getContents());
            }
        }
    }

    public void lonelyClicked() {
        for (MentalHelp help: mentalHelpList
        ) {
            if (help.getType().equals("lonely")) {
                helpLabel.setText(help.getContents());
            }
        }
    }

    public void otherHelpClicked() {
        for (MentalHelp help: mentalHelpList
        ) {
            if (help.getType().equals("other")) {
                helpLabel.setText(help.getContents());
            }
        }
    }
}