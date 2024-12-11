package at.buesra.projects.basics.OO;

public class Engine {
    public enum TYPE{DIESEL,BENZIN};
    private int horspower;
    private TYPE type;

    public Engine(int horspower, TYPE type) {
        this.horspower = horspower;
        this.type = type;
    }

    public void drive(int amount) {
        System.out.println("the motor is running with" + amount);
    }

    public int getHorspower() {
        return horspower;
    }

    public TYPE getType() {
        return type;

    }
}
