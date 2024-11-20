package at.buesra.projects.basics.OO;

public class Cars {

    //Instanz/Gedächtnisvariablen

    public int carSpiritverbrauch;
    public String carcolor;
    public String carserialNumber;
    public int fuelAmount;

//Methode
    public void drive(){
       this.fuelAmount=this.fuelAmount-carSpiritverbrauch;
        System.out.println("I'm driving");
    }

}
