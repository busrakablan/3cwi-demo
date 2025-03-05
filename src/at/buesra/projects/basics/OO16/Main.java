package at.buesra.projects.basics.OO16;

public class Main {
    public static void main(String[] args) {
        Speicherkarte s1 = new Speicherkarte("black");
        Kamera k1 = new Kamera(10);
        Phone p1 = new Phone(k1, s1);

        p1.takePicture();
        p1.takePicture();

        p1.getKamera().setResuolution(1);
        System.out.println(p1.getSpeicherkarte().getCapacity());
        p1.printAllFiles();






    }
}
