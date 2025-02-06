package at.buesra.projects.basics.OO11;

public class Truck extends Car{
    private String trailer;
    public Truck(String color, int speed, int price, int consumption, Producer producer, Engine engine, String trailer) {
        super(color, speed, price, consumption, producer, engine);
        this.trailer=trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }

    public String getTrailer() {
        return trailer;
    }

}
