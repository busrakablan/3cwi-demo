package at.buesra.projects.basics.OO16;

import java.util.ArrayList;
import java.util.List;

public class Speicherkarte extends Phone{
    private int capacity=5;
    private List<PhoneFile> fotos = new ArrayList<PhoneFile>();

    public Speicherkarte(String color) {
        super(color);
    }

    public void saveFile(PhoneFile phoneFile) {
        fotos.add(phoneFile);
    }

    public void getAllFiles(){
       for( PhoneFile foto : fotos){
           System.out.println(foto.getName());
           System.out.println(foto.getSize());
           System.out.println("");
       }
    }

    public void sizecapacity(){
        capacity=capacity-PhoneFile.;
    }

}
