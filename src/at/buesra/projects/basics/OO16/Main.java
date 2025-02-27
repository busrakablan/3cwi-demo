package at.buesra.projects.basics.OO16;

import java.awt.image.Kernel;

public class Main {
    public static void main(String[] args) {
        Speicherkarte s1 = new Speicherkarte("black");
        Kamera k1 = new Kamera(50);
        Phone p1 = new Phone("rosegold");

        p1.takePicture(k1,s1);
        p1.takePicture(k1,s1);
        p1.takePicture(k1,s1);
        p1.takePicture(k1,s1);
        p1.takePicture(k1,s1);
        s1.getAllFiles();


    }
}
