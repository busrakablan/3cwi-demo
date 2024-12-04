package at.buesra.projects.basics.OO;

public class DasErsteObjekt {
    public static void main(String[] args) {

        // Wir bauen das erste Objekt. Ein Auto!
        //  Ein Auto hat Eigenschaften (Farbe, Spritverbrauch, Seriennummer) und Fähigkeiten (fahren, bremsen).


        Cars c1 = new Cars(10,"blue","1234",70);

        c1.setFuelAmount(80);

        System.out.println(c1.getFuelUsage());

        c1.dobreak();
        c1.turboBoost();
        c1.amountOfRepetitions(3);
        c1.getRemainingRange();


        Cars c2 = new Cars(18, "blue", "1234",70 );

        //System.out.println(c2.carSpiritverbrauch);


        System.out.println(c1.getCarcolor());

        System.out.println(c1.getCarserialNumber());
        c1.drive();
        System.out.println(c1.getFuelAmount());


    }
}
