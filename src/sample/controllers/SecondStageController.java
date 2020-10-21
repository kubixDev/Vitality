package sample.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;


public class SecondStageController {

    @FXML
    Button buttonBack;
    @FXML
    Button buttonNext;
    @FXML
    Label questionLabel1;
    @FXML
    Label questionLabel2;
    @FXML
    Label questionLabel3;
    @FXML
    Label questionLabel4;
    @FXML
    Label resultLabel;
    @FXML
    Label infoLabel;
    @FXML
    Label adviceLabel;
    @FXML
    CheckBox checkBox1;
    @FXML
    CheckBox checkBox2;
    @FXML
    CheckBox checkBox3;
    @FXML
    CheckBox checkBox4;


    // ustawia wartosci licznikow
    int licznikObjawow = 0;
    int licznikTury = 0;



    // powrot do poprzedniej sceny
    public void backClicked() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/resources/view/Menu.fxml"));

        Stage window = (Stage) buttonBack.getScene().getWindow();
        window.setScene(new Scene(root,1280, 720));
    }



    // uruchamia sie na start - klika guzik aby zaczac od 1 tury pytan
    public void initialize() {
        buttonNext.fire();
    }



    // osobne funkcje ustawiajace tekst pytan
    public void questionsFirstCase() {
        questionLabel1.setText("wystąpiła u mnie temp. powyżej 38 C");
        questionLabel2.setText("odczuwam duszności");
        questionLabel3.setText("bolą mnie mięśnie");
        questionLabel4.setText("czuję się zmęczony");
    }
    public void questionsSecondCase() {
        questionLabel1.setText("często kaszlę");
        questionLabel2.setText("boli mnie gardło");
        questionLabel3.setText("mam biegunkę");
        questionLabel4.setText("mój węch jest zaburzony");
    }
    public void questionsThirdCase() {
        questionLabel1.setText("mój smak jest zaburzony");
        questionLabel2.setText("boli mnie głowa");
        questionLabel3.setText("wystąpiła u mnie wysypka");
        questionLabel4.setText("odczuwam nudności");
    }
    public void questionsDefault() {
        questionLabel1.setText("");
        questionLabel2.setText("");
        questionLabel3.setText("");
        questionLabel4.setText("");
    }



    // ustawia pytania bazujac na wprowadzonym liczniku tury
    public void setQuestion(int tura) {
        switch (tura) {
            case 1: {
                questionsFirstCase();
                break;
            }
            case 2: {
                questionsSecondCase();
                break;
            }
            case 3: {
                questionsThirdCase();
                break;
            }
            default: {
                questionsDefault();
                break;
            }
        }
    }



    // resetuje zaznaczone checkboxy
    public void resetSelected() {
        checkBox1.setSelected(false);
        checkBox2.setSelected(false);
        checkBox3.setSelected(false);
        checkBox4.setSelected(false);
    }



    // liczy zaznaczone checkboxy
    public void countSelected() {
        if (checkBox1.isSelected()) {
            licznikObjawow++;
        }
        if (checkBox2.isSelected()) {
            licznikObjawow++;
        }
        if (checkBox3.isSelected()) {
            licznikObjawow++;
        }
        if (checkBox4.isSelected()) {
            licznikObjawow++;
        }
    }



    // ustawia porade bazujac na wprowadzonej ilosci objawow
    public String setAdvice(int symptomCount) {
        if (symptomCount <= 2) {
            return "Nie występuje u Ciebie wiele objawów, istnieje niewielka szansa na obecność koronawirusa. Stosuj się do zasad reżimu sanitarnego, nie zapominając o środkach ostrożności. W razie złego samopoczucia koniecznie zgłoś się do lekarza";
        }
        if (symptomCount < 6) {
            return "Wystąpiło u Ciebie kilka objawów, możesz być zagrożony koronawirusem. Obserwuj przebieg symptomów, jeżeli nie ustąpią lub będą się nasilać,  niezwłocznie zgłoś się do lekarza. Pamiętaj, żeby nie narażać innych osób - noś maseczkę";
        }

        return "Wystąpiła u Ciebie spora liczba objawów charakterystycznych dla koronawirusa. Niezwłocznie zgłoś się do lekarza, który zdecyduje o dalszym przebiegu leczenia. Pamiętaj, żeby nie narażać innych osób - noś maseczkę";
    }



    // sprawdza wyjatkowe przypadki licznika tury
    public void checkLicznikTury() {
        if (licznikTury == 3) {
            buttonNext.setText("wynik");
        }
        if (licznikTury == 4) {
            checkBox1.setDisable(true);
            checkBox2.setDisable(true);
            checkBox3.setDisable(true);
            checkBox4.setDisable(true);
            buttonNext.setDisable(true);

            resultLabel.setText(String.valueOf(licznikObjawow));
            adviceLabel.setText(setAdvice(licznikObjawow));
            infoLabel.setText("Sprawdź wynik po prawej stronie");

        }
    }



    // glowny przycisk nawigacji po tescie
    public void nextClicked() {
        licznikTury++;

        countSelected();

        resetSelected();

        checkLicznikTury();

        setQuestion(licznikTury);
    }
}