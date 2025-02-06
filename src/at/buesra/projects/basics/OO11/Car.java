package at.buesra.projects.basics.OO11;

import at.buesra.projects.basics.OO2.Batery;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String color;
    private int speed;
    private int price;
    private int consumption;
    private Producer producer;
    private Engine engine;


    public Car(String color, int speed, int price, int consumption, Producer producer, Engine engine) {
        this.color = color;
        this.speed = speed;
        this.price = price;
        this.consumption = consumption;
        this.producer = producer;
        this.engine = engine;
    }

    public void addProducer(Producer producer){
        Producer.add(producer);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

