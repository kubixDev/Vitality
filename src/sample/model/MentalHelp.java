package sample.model;

public class MentalHelp {
    // klasa stworzona na potrzeby wczytywania tekstu pomocy

    String type;
    String contents;

    public MentalHelp(String type, String contents) {
        this.type = type;
        this.contents = contents;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    @Override
    public String toString() {
        return "MentalHelp{" +
                "type='" + type + '\'' +
                ", contents='" + contents + '\'' +
                '}';
    }
}
