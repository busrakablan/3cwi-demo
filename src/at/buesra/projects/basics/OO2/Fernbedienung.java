package at.buesra.projects.basics.OO2;

import java.util.ArrayList;
import java.util.List;

public class Fernbedienung {
    private List<Batery> bateries;

    public Fernbedienung(){
        this.bateries = new ArrayList<Batery>();
    };


    public void addBatery(Batery batery){
        bateries.add(batery);
    }

    public void turnOn(){
        for(Batery batery : bateries){
            batery.setEnergy( batery.getEnergy() - 5);
            System.out.println(batery.getEnergy());
        }

    }

}
