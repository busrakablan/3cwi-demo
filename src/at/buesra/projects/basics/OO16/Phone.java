package at.buesra.projects.basics.OO16;

import java.util.List;

public class Phone {
    private String color;
    private Kamera kamera;
    private Speicherkarte speicherkarte;

    public Phone(Kamera kamera, Speicherkarte speicherkarte) {
        this.kamera = kamera;
        this.color = color;
        this.speicherkarte = speicherkarte;
    }

    public void takePicture() {
        PhoneFile foto = kamera.makePicture();
        speicherkarte.saveFile(foto);

    }

    public Speicherkarte getSpeicherkarte() {
        return speicherkarte;
    }

    public Kamera getKamera() {
        return kamera;
    }

    public void printAllFiles() {
        List<PhoneFile> files = speicherkarte.getAllFiles();
        for (int i = 0; i < files.size(); i++) {
            System.out.println(files.get(i).getName() + " size:" + files.get(i).getSize());

        }
    }
}
