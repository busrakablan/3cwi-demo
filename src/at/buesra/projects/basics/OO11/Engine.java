package at.buesra.projects.basics.OO11;

public class Engine {
    private int leistung;
    public enum TYPE{DIESEL,BENZIN};

    public void setLeistung(int leistung) {
        this.leistung = leistung;
    }

    public int getLeistung() {
        return leistung;
    }
}
