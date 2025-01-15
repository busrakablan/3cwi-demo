package at.buesra.projects.basics.OO2;

public class Main {
    public static void main(String[] args) {

        Batery b1 = new Batery(10,"sdf");
        Batery b2 = new Batery(13,"sdgf");

        Fernbedienung f1 = new Fernbedienung();

        f1.addBatery(b1);
        f1.addBatery(b2);
        f1.turnOn();

    }
}
