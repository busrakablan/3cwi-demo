package at.buesra.projects.basics.OO;

public class DasErsteObjekt {
    public static void main(String[] args) {

        // Wir bauen das erste Objekt. Ein Auto!
        //  Ein Auto hat Eigenschaften (Farbe, Spritverbrauch, Seriennummer) und Fähigkeiten (fahren, bremsen).

        Engine e1 = new Engine(250, Engine.TYPE.BENZIN, 50);
        Mirror m1 = new Mirror(100,0);
        Mirror m2 = new Mirror(95,-35);
        Cars c1 = new Cars(e1,100,"blue","1234",100,100);
        c1.addMirror(m1);
        c1.addMirror(m2);

        c1.getMirrors().get(0).getPosAndSize();

        c1.setFuelAmount(80);

        // test

        //System.out.println(c1.getFuelUsage());

        c1.dobreak();
        c1.turboBoost();
        c1.amountOfRepetitions(3);
        c1.getRemainingRange();


        //Cars c2 = new Cars(e1, 100, "blue","1234",100 );

        //System.out.println(c2.carSpiritverbrauch);"


        //System.out.println(c1.getCarcolor());

        //System.out.println(c1.getCarserialNumber());
        //c1.drive();
        //System.out.println(c1.getFuelAmount());

        c1.getEngine().drive(100);
        System.out.println(c1.getEngine().getTank());
    }
}
