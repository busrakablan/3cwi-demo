package at.buesra.projects.basics.OO16;

public class Kamera extends Phone {

    private int Resuolution;

    public PhoneFile makePicture (){
      return new PhoneFile(5,"Fotos");
    }

    public Kamera(int resuolution) {
        Resuolution = resuolution;
    }
}