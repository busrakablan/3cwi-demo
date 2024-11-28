package at.buesra.projects.basics.OO;

public class Cars {

    //Instanz/Gedächtnisvariablen

    public int carSpiritverbrauch;
    public String carcolor;
    public String carserialNumber;
    public int fuelAmount;
    public int turboBoost;
    public int amountOfRepetitions;
    public int getRemainingRange;

    public  Cars(int cS, String carColor, String carSerialNumber ){
    this.carSpiritverbrauch = cS;
    this.carcolor=carColor;
    this.carserialNumber=carSerialNumber;
    }

    //Methode
    public void drive() {
        this.fuelAmount = this.fuelAmount
                - carSpiritverbrauch;
        //System.out.println("I'm driving");
    }

    public void dobreak() {

        //System.out.println("Ich bremse");
    }

    public void turboBoost() {
        if (fuelAmount > carSpiritverbrauch * 0.1) {
            //System.out.println("SuperBoostMode");
        } else {
            //System.out.println("Not enough fuel to go to Superboost");
        }
    }

    public void amountOfRepetitions(int repetition) {
        for (int i = 0; i < repetition; i++) {
            //System.out.println("Tuuut");
        }
    }

    public void getRemainingRange(){
        getRemainingRange=carSpiritverbrauch/fuelAmount;
        //System.out.println(getRemainingRange);
    }
}
