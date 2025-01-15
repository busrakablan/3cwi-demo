package at.buesra.projects.basics.OO2;

public class Batery {
    private int Energy = 100;
    private String Marke;


    public void setEnergy(int energy) {
        Energy = energy;
    }

    public void setMarke(String marke) {
        Marke = marke;
    }

    public int getEnergy() {
        return Energy;
    }

    public String getMarke() {
        return Marke;
    }

    public Batery(int energy, String marke) {
        this.Energy = energy;
        this.Marke = marke;




    }


}


