package sample.model;

public class Quote {
    // klasa stworzona na potrzeby wczytywania cytatow motywacyjnych

    String osoba;
    String cytat;

    public Quote(String osoba, String cytat) {
        this.osoba = osoba;
        this.cytat = cytat;
    }

    public String getOsoba() {
        return osoba;
    }

    public void setOsoba(String osoba) {
        this.osoba = osoba;
    }

    public String getCytat() {
        return cytat;
    }

    public void setCytat(String cytat) {
        this.cytat = cytat;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "osoba='" + osoba + '\'' +
                ", cytat='" + cytat + '\'' +
                '}';
    }
}
