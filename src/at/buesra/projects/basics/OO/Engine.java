package at.buesra.projects.basics.OO;

public class Engine {
    public enum TYPE{DIESEL,BENZIN};
    private int horspower;
    private TYPE type;
    private int tank;


    public Engine(int horspower, TYPE type, int tank) {
        this.horspower = horspower;
        this.type = type;
        this.tank=tank;
    }
    // amount should be bewtween 0 and 100
    public void drive(int speed) {

        if (speed < 30){
            this.tank -= 1;
        } else if (speed<60) {
            this.tank -= 3;
        }
    }

    public int getHorspower() {
        return horspower;
    }

    public TYPE getType() {
        return type;

    }

    public int getTank() {
        return tank;
    }

    public void setTank(int tank) {
        this.tank = tank;
    }
}
