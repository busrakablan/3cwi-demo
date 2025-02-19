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


    @Override
    public void drive() {
        System.out.println(" I am driving the truck - consumption is high");
        //super.drive();
    }

    @Override
    public void stop() {
        System.out.println("I am breaking .... truck");
    }
}
