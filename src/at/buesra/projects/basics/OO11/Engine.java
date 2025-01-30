package at.buesra.projects.basics.OO11;

public class Engine {
    private int leistung;
    public enum TYPE{DIESEL,BENZIN};
    private TYPE type;

    public void setLeistung(int leistung) {
        this.leistung = leistung;
    }

    public int getLeistung() {
        return leistung;
    }

    public Engine(int leistung , TYPE type) {
        this.leistung = leistung;
        this.type = type;
    }
}
