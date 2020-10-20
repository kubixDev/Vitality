package sample.model;

public class Station {
    // klasa stworzona na potrzeby danych o sanepidzie, przechowuje stringi danych o wojewodztwie, adresie i telefonie
    // constructor, gettery i settery, toString

    String wojewodztwo;
    String adres;
    String telefon;

    public Station(String wojewodztwo, String adres, String telefon) {
        this.wojewodztwo = wojewodztwo;
        this.adres = adres;
        this.telefon = telefon;
    }

    public String getWojewodztwo() {
        return wojewodztwo;
    }

    public void setWojewodztwo(String wojewodztwo) {
        this.wojewodztwo = wojewodztwo;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    @Override
    public String toString() {
        return "Station{" +
                "wojewodztwo='" + wojewodztwo + '\'' +
                ", adres='" + adres + '\'' +
                ", telefon='" + telefon + '\'' +
                '}';
    }
}
