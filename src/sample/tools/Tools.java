package sample.tools;

import sample.model.MentalHelp;
import sample.model.Quote;
import sample.model.Station;
import sample.model.Statistics;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Tools {

    // odpowiada za wczytanie listy stacji z pliku
    public static List<Station> getStationsFromFile(String fileName) {
        List<Station> result = new ArrayList<>();

        try {
            List<String> lista = Files.readAllLines(Paths.get(fileName));
            for (String element: lista                                                     // element to pojedynczy wiersz z pliku
                 ) {
                String[] tablica = element.split(";");                               // elementy podzielone sa srednikami
                Station station = new Station(tablica[0], tablica[1], tablica[2]);         // np tablica[0] - wojewodztwo, tablica[1] - adres itd
                result.add(station);
            }

        // wyjatek gdyby nie bylo pliku
        } catch (IOException e) {
            e.printStackTrace();
        }

        // zwraca liste obiektu Station zawierajaca dane z wprowadzonego pliku
        return result;
    }

    // odpowiada za wczytanie cytatow z pliku
    public static List<Quote> getQuoteFromFile(String fileName) {
        List<Quote> result = new ArrayList<>();

        try {
            List<String> lista = Files.readAllLines(Paths.get(fileName));
            for (String element: lista
            ) {
                String[] tablica = element.split(";");
                Quote quote = new Quote(tablica[0], tablica[1]);
                result.add(quote);
            }

        // wyjatek gdyby nie bylo pliku
        } catch (IOException e) {
            e.printStackTrace();
        }

        // zwraca liste obiektu Quote zawierajaca dane z wprowadzonego pliku
        return result;
    }

    // odpowiada za wczytanie pomocy z pliku
    public static List<MentalHelp> getHelpFromFile(String fileName) {
        List<MentalHelp> result = new ArrayList<>();

        try {
            List<String> lista = Files.readAllLines(Paths.get(fileName));
            for (String element: lista
            ) {
                String[] tablica = element.split(";");
                MentalHelp mentalHelp = new MentalHelp(tablica[0], tablica[1]);
                result.add(mentalHelp);
            }

        // wyjatek gdyby nie bylo pliku
        } catch (IOException e) {
            e.printStackTrace();
        }

        // zwraca liste obiektu MentalHelp zawierajaca dane z wprowadzonego pliku
        return result;
    }

    // odpowiada za wczytanie statystyk z pliku
    public static List<Statistics> getStatisticsFromFile(String fileName) {
        List<Statistics> result = new ArrayList<>();

        try {
            List<String> lista = Files.readAllLines(Paths.get(fileName));
            for (String element: lista
            ) {
                String[] tablica = element.split(";");
                Statistics statistics = new Statistics(tablica[0], tablica[1], tablica[2], tablica[3], tablica[4], tablica[5], tablica[6], tablica[7], tablica[8], tablica[9]);
                result.add(statistics);
            }

            // wyjatek gdyby nie bylo pliku
        } catch (IOException e) {
            e.printStackTrace();
        }

        // zwraca liste obiektu Statistics zawierajaca dane z wprowadzonego pliku
        return result;
    }
}