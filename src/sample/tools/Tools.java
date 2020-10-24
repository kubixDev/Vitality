package sample.tools;

import sample.model.MentalHelp;
import sample.model.Quote;
import sample.model.Station;
import sample.model.Statistics;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Tools {
    public static List<Station> getStationsFromFile(Path fileName) {
        List<Station> result = new ArrayList<>();

        try {
            List<String> lista = Files.readAllLines(fileName);
            for (String element: lista
                 ) {
                String[] tablica = element.split(";");
                Station station = new Station(tablica[0], tablica[1], tablica[2]);
                result.add(station);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }


    public static List<Quote> getQuoteFromFile(Path fileName) {
        List<Quote> result = new ArrayList<>();

        try {
            List<String> lista = Files.readAllLines(fileName);
            for (String element: lista
            ) {
                String[] tablica = element.split(";");
                Quote quote = new Quote(tablica[0], tablica[1]);
                result.add(quote);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }


    public static List<MentalHelp> getHelpFromFile(Path fileName) {
        List<MentalHelp> result = new ArrayList<>();

        try {
            List<String> lista = Files.readAllLines(fileName);
            for (String element: lista
            ) {
                String[] tablica = element.split(";");
                MentalHelp mentalHelp = new MentalHelp(tablica[0], tablica[1]);
                result.add(mentalHelp);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }


    public static List<Statistics> getStatisticsFromFile(Path fileName) {
        List<Statistics> result = new ArrayList<>();

        try {
            List<String> lista = Files.readAllLines(fileName);
            for (String element: lista
            ) {
                String[] tablica = element.split(";");
                Statistics statistics = new Statistics(tablica[0], tablica[1], tablica[2], tablica[3], tablica[4], tablica[5], tablica[6], tablica[7], tablica[8], tablica[9]);
                result.add(statistics);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }
}