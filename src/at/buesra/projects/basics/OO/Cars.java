package at.buesra.projects.basics.OO;

public class Cars {

    //Instanz/Gedächtnisvariablen
    private  Engine engine;
    private int fuelUsage;
    private String carcolor;
    private String carserialNumber;
    private int fuelAmount;
    private int speed;

    private int amountOfRepetitions;
    private int getRemainingRange;

    public Cars(Engine engine,int fuelUsage, String carColor, String carSerialNumber,int fuelAmount, int speed) {
        this.engine = engine;
        this.fuelUsage = fuelUsage;
        this.carcolor = carColor;
        this.carserialNumber = carSerialNumber;
        this.fuelAmount = fuelAmount;
        this.speed= speed;
    }

    //Methode
    public void drive() {
        //this.fuelAmount = this.fuelAmount- fuelUsage;
        //System.out.println("I'm driving");


    }

    public void dobreak() {

        //System.out.println("Ich bremse");
    }

    public void turboBoost() {
        if (fuelAmount > fuelUsage * 0.1) {
            System.out.println("SuperBoostMode");
        } else {
            System.out.println("Not enough fuel to go to Superboost");
        }
    }

    public void amountOfRepetitions(int repetition) {
        for (int i = 0; i < repetition; i++) {
            //System.out.println("Tuuut");
        }
    }



    public void getRemainingRange() {
        getRemainingRange = fuelUsage / fuelAmount;
        //System.out.println(getRemainingRange);
    }

    public void setFuelUsage(int fuelUsage) {
        this.fuelUsage = fuelUsage;

    }


    public void setFuelAmount(int fuelAmount) {
        if (fuelAmount > 100) {
            this.fuelAmount = 100;
        } else {

        }
        this.fuelAmount = fuelAmount;
    }





    public int getGetRemainingRange() {
        return getRemainingRange;
    }

    public Engine getEngine() {
        return engine;
    }
}



