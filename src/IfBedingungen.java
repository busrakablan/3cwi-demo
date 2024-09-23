
import java.util.Random;

public class IfBedingungen {
    public static void main(String[] args) {
        // Zufallszahlen erstellen zwischen 0-100
        Random random = new Random();
        int randomnumber = random.nextInt(100);

        // Gib die Zufallszahl aus
        System.out.println(randomnumber);

        // Wenn die Zahl kleiner ist als 20  gib aus "Mini"
        // Wenn die Zahl zw. 20 und 50 ist gib aus "Medium"
        // Wenn die Zahl größer als 50 ist gib aus "Large"
         if(randomnumber<20) {
             System.out.println("Mini");
         } else if ((randomnumber>20) && (randomnumber<50)){
            System.out.println("Medium");
         } else if (randomnumber>50){
            System.out.println("Large");
        }





    }
}