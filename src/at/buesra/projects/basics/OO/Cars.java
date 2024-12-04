package at.buesra.projects.basics.OO;

public class Cars {

    //Instanz/Gedächtnisvariablen

    private int fuelUsage;
    private String carcolor;
    private String carserialNumber;
    private int fuelAmount;

    private int amountOfRepetitions;
    private int getRemainingRange;

    public Cars(int fuelUsage, String carColor, String carSerialNumber,int fuelAmount) {
        this.fuelUsage = fuelUsage;
        this.carcolor = carColor;
        this.carserialNumber = carSerialNumber;
        this.fuelAmount = fuelAmount;
    }

    //Methode
    public void drive() {
        this.fuelAmount = this.fuelAmount
                - fuelUsage;
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

    public void setCarcolor(String carcolor) {
        this.carcolor = carcolor;
    }

    public void setCarserialNumber(String carserialNumber) {
        this.carserialNumber = carserialNumber;
    }

    public void setFuelAmount(int fuelAmount) {
        if (fuelAmount > 100) {
            this.fuelAmount = 100;
        } else {

        }
        this.fuelAmount = fuelAmount;
    }

    public void setAmountOfRepetitions(int amountOfRepetitions) {
        this.amountOfRepetitions = amountOfRepetitions;
    }

    public void setGetRemainingRange(int getRemainingRange) {
        this.getRemainingRange = getRemainingRange;
    }



    public String getCarcolor() {
        return carcolor;
    }

    public int getFuelUsage() {
        return fuelUsage;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    public String getCarserialNumber() {
        return carserialNumber;
    }

    public int getAmountOfRepetitions() {
        return amountOfRepetitions;
    }



    public int getGetRemainingRange() {
        return getRemainingRange;
    }
}



