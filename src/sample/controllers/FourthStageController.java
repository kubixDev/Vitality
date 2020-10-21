package sample.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.*;
import javafx.stage.Stage;
import sample.model.Quote;
import sample.model.Statistics;
import sample.tools.Tools;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

public class FourthStageController {

    @FXML
    Button buttonBack;
    @FXML
    RadioButton radioButtonPolska;
    @FXML
    RadioButton radioButtonSwiat;
    @FXML
    Label labelStyczen;
    @FXML
    Label labelLuty;
    @FXML
    Label labelMarzec;
    @FXML
    Label labelKwiecien;
    @FXML
    Label labelMaj;
    @FXML
    Label labelCzerwiec;
    @FXML
    Label labelLipiec;
    @FXML
    Label labelSierpien;
    @FXML
    Label labelWrzesien;
    @FXML
    private BarChart<?, ?> barChart;
    @FXML
    private CategoryAxis x;
    @FXML
    private NumberAxis y;

    // ustalenie listy statystyk
    // zrodlo danych: https://www.medicover.pl/koronawirus/statystyki/
    List<Statistics> statistics = Tools.getStatisticsFromFile(Paths.get("src/resources/files/zarazeniaMiesiecznie.txt"));



    // metoda uruchamia sie na starcie, ustawia domyslny radiobutton i blokuje zbedne animacje
    public void initialize() {
        radioButtonPolska.fire();
        barChart.setAnimated(false);
    }



    // powrot do poprzedniej sceny
    public void backClicked() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/resources/view/Menu.fxml"));

        Stage window = (Stage) buttonBack.getScene().getWindow();
        window.setScene(new Scene(root,1280, 720));
    }



    // ustawia labele z iloscia przypadkow
    public void setLabels(String region) {
        for (Statistics stats: statistics
        ) {
            if (stats.getRegion().equals(region)) {
                labelStyczen.setText(stats.getStyczenPrzypadki());
                labelLuty.setText(stats.getLutyPrzypadki());
                labelMarzec.setText(stats.getMarzecPrzypadki());
                labelKwiecien.setText(stats.getKwiecienPrzypadki());
                labelMaj.setText(stats.getMajPrzypadki());
                labelCzerwiec.setText(stats.getCzerwiecPrzypadki());
                labelLipiec.setText(stats.getLipiecPrzypadki());
                labelSierpien.setText(stats.getSierpienPrzypadki());
                labelWrzesien.setText(stats.getWrzesienPrzypadki());
            }
        }
    }



    // metoda resetuje barChart, aby wykresy sie nie nalozyly
    public void resetChart() {
        barChart.getData().clear();
    }



    // metoda tworzy serie dla wprowadzonej nazwy i numeru danych
    public void createSeries(String chartName, int numerDanych) {
        XYChart.Series series = new XYChart.Series<>();
        series.setName(chartName);
        series.getData().add(new XYChart.Data("styczeń", Integer.parseInt(statistics.get(numerDanych).getStyczenPrzypadki()) ));
        series.getData().add(new XYChart.Data("luty", Integer.parseInt(statistics.get(numerDanych).getLutyPrzypadki()) ));
        series.getData().add(new XYChart.Data("marzec", Integer.parseInt(statistics.get(numerDanych).getMarzecPrzypadki()) ));
        series.getData().add(new XYChart.Data("kwiecień", Integer.parseInt(statistics.get(numerDanych).getKwiecienPrzypadki()) ));
        series.getData().add(new XYChart.Data("maj", Integer.parseInt(statistics.get(numerDanych).getMajPrzypadki()) ));
        series.getData().add(new XYChart.Data("czerwiec", Integer.parseInt(statistics.get(numerDanych).getCzerwiecPrzypadki()) ));
        series.getData().add(new XYChart.Data("lipiec", Integer.parseInt(statistics.get(numerDanych).getLipiecPrzypadki()) ));
        series.getData().add(new XYChart.Data("sierpień", Integer.parseInt(statistics.get(numerDanych).getSierpienPrzypadki()) ));
        series.getData().add(new XYChart.Data("wrzesień", Integer.parseInt(statistics.get(numerDanych).getWrzesienPrzypadki()) ));
        barChart.getData().addAll(series);
    }



    // ustawia konkretna serie w barChart w zaleznosci od wybranego radioButtona
    public void setSeries() {
        resetChart();

        if (radioButtonPolska.isSelected()) {
            createSeries("Polska", 0);
        }
        if (radioButtonSwiat.isSelected()) {
            createSeries("Świat", 1);
        }
    }



    // radiobutton zmienia dane regionu na Polske
    public void polskaChecked() {
        setLabels("Polska");
        setSeries();
    }
    // radiobutton zmienia dane regionu na swiat
    public void swiatChecked() {
        setLabels("Świat");
        setSeries();
    }
}