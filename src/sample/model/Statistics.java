package sample.model;

public class Statistics {
    // klasa stworzona na potrzeby wczytywania statystyk koronawirusa

    String region;
    String styczenPrzypadki;
    String lutyPrzypadki;
    String marzecPrzypadki;
    String kwiecienPrzypadki;
    String majPrzypadki;
    String czerwiecPrzypadki;
    String lipiecPrzypadki;
    String sierpienPrzypadki;
    String wrzesienPrzypadki;

    public Statistics(String region, String styczenPrzypadki, String lutyPrzypadki, String marzecPrzypadki, String kwiecienPrzypadki, String majPrzypadki, String czerwiecPrzypadki, String lipiecPrzypadki, String sierpienPrzypadki, String wrzesienPrzypadki) {
        this.region = region;
        this.styczenPrzypadki = styczenPrzypadki;
        this.lutyPrzypadki = lutyPrzypadki;
        this.marzecPrzypadki = marzecPrzypadki;
        this.kwiecienPrzypadki = kwiecienPrzypadki;
        this.majPrzypadki = majPrzypadki;
        this.czerwiecPrzypadki = czerwiecPrzypadki;
        this.lipiecPrzypadki = lipiecPrzypadki;
        this.sierpienPrzypadki = sierpienPrzypadki;
        this.wrzesienPrzypadki = wrzesienPrzypadki;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getStyczenPrzypadki() {
        return styczenPrzypadki;
    }

    public void setStyczenPrzypadki(String styczenPrzypadki) {
        this.styczenPrzypadki = styczenPrzypadki;
    }

    public String getLutyPrzypadki() {
        return lutyPrzypadki;
    }

    public void setLutyPrzypadki(String lutyPrzypadki) {
        this.lutyPrzypadki = lutyPrzypadki;
    }

    public String getMarzecPrzypadki() {
        return marzecPrzypadki;
    }

    public void setMarzecPrzypadki(String marzecPrzypadki) {
        this.marzecPrzypadki = marzecPrzypadki;
    }

    public String getKwiecienPrzypadki() {
        return kwiecienPrzypadki;
    }

    public void setKwiecienPrzypadki(String kwiecienPrzypadki) {
        this.kwiecienPrzypadki = kwiecienPrzypadki;
    }

    public String getMajPrzypadki() {
        return majPrzypadki;
    }

    public void setMajPrzypadki(String majPrzypadki) {
        this.majPrzypadki = majPrzypadki;
    }

    public String getCzerwiecPrzypadki() {
        return czerwiecPrzypadki;
    }

    public void setCzerwiecPrzypadki(String czerwiecPrzypadki) {
        this.czerwiecPrzypadki = czerwiecPrzypadki;
    }

    public String getLipiecPrzypadki() {
        return lipiecPrzypadki;
    }

    public void setLipiecPrzypadki(String lipiecPrzypadki) {
        this.lipiecPrzypadki = lipiecPrzypadki;
    }

    public String getSierpienPrzypadki() {
        return sierpienPrzypadki;
    }

    public void setSierpienPrzypadki(String sierpienPrzypadki) {
        this.sierpienPrzypadki = sierpienPrzypadki;
    }

    public String getWrzesienPrzypadki() {
        return wrzesienPrzypadki;
    }

    public void setWrzesienPrzypadki(String wrzesienPrzypadki) {
        this.wrzesienPrzypadki = wrzesienPrzypadki;
    }

    @Override
    public String toString() {
        return "Statistics{" +
                "region='" + region + '\'' +
                ", styczenPrzypadki='" + styczenPrzypadki + '\'' +
                ", lutyPrzypadki='" + lutyPrzypadki + '\'' +
                ", marzecPrzypadki='" + marzecPrzypadki + '\'' +
                ", kwiecienPrzypadki='" + kwiecienPrzypadki + '\'' +
                ", majPrzypadki='" + majPrzypadki + '\'' +
                ", czerwiecPrzypadki='" + czerwiecPrzypadki + '\'' +
                ", lipiecPrzypadki='" + lipiecPrzypadki + '\'' +
                ", sierpienPrzypadki='" + sierpienPrzypadki + '\'' +
                ", wrzesienPrzypadki='" + wrzesienPrzypadki + '\'' +
                '}';
    }
}
