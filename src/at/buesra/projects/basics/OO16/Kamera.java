package at.buesra.projects.basics.OO16;

public class Kamera {

    private int Resuolution;

    public Kamera(int resuolution) {
        this.Resuolution = resuolution;
    }

    public void setResuolution(int resuolution) {
        this.Resuolution = resuolution;
    }

    public PhoneFile makePicture() {
        int size = 10; // Standardgröße

        if (Resuolution == 1) {
            size = 10;
        } else if (Resuolution == 2) {
            size = 7;
        } else if (Resuolution == 3) {
            size = 3;
        }

        return new PhoneFile(size, "Urlaubfotos");
    }
}
