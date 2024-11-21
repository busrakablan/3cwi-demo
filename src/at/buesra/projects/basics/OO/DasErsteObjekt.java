package at.buesra.projects.basics.OO;

public class DasErsteObjekt {
    public static void main(String[] args) {

        // Wir bauen das erste Objekt. Ein Auto!
        //  Ein Auto hat Eigenschaften (Farbe, Spritverbrauch, Seriennummer) und Fähigkeiten (fahren, bremsen).

        Cars c1 = new Cars();
        c1.carcolor = "blue";
        c1.carSpiritverbrauch = 8;
        c1.carserialNumber = "BK54BK";
        c1.fuelAmount = 80;
        c1.dobreak();
        c1.turboBoost();
        c1.amountOfRepetitions(3);
        c1.getRemainingRange();


        //System.out.println(c1.carserialNumber);

        System.out.println(c1.fuelAmount);
        c1.drive();
        System.out.println(c1.fuelAmount);
    }
}
