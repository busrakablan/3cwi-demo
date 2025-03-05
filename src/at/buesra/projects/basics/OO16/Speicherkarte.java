package at.buesra.projects.basics.OO16;

import java.util.ArrayList;
import java.util.List;

public class Speicherkarte {
    private int capacity = 20;
    private List<PhoneFile> fotos = new ArrayList<PhoneFile>();

    public Speicherkarte(String color) {
        super();
    }

    public void saveFile(PhoneFile phoneFile) {
        changeCapacity(phoneFile.getSize());
        fotos.add(phoneFile);
    }

    public List<PhoneFile> getAllFiles() {
       return fotos;
    }

    public int getCapacity() {
        return capacity;
    }

    public void changeCapacity(int size) {
        this.capacity = this.capacity - size;

    }

}
