package at.buesra.projects.basics.OO11;

import at.buesra.projects.basics.OO2.Batery;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String color;
    private int speed;
    private int price;
    private int consumption;
    private List<Producer> producers;
    private Engine engine;


    public Car(){
        this.producers = new ArrayList<Producer>();
    };


    public void addProducer(Producer producer){
        Producer.add(producer);
    }
}

