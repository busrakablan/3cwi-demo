package at.buesra.projects.basics.OO16;

public class Phone {
    private String color;

    public Phone(String color) {
        this.color = color;
    }

    public void takePicture(Kamera kamera, Speicherkarte speicherkarte){
        PhoneFile foto = kamera.makePicture();
        speicherkarte.saveFile(foto);
    }

    public void makeCall(String makeCall){

    }

    public void getfreeSpace (int getfreeSpace){

    }

    public void printAllFiles(){

    }
}
