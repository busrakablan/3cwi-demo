import java.util.Scanner;

public class Bankomat {
    public static void main(String[] args) {
        int balance = 0;
        boolean isFinisched = false;
        //Diese Aufgabe setzt sich aus allen gelernten Inhalten zusammen!
        //Erstelle ein Programm, das einen Bankomaten simuliert. Folgende Möglichkeiten gibt es:
        // 1. Einzahlen
        //2. Abheben
        //3. Kontostand
        //4. Beenden
       while (!isFinisched){
           System.out.println("Wählen Sie: 1 Einzahlen 2 Abheben 3 Kontostand 4 Beenden");
           Scanner scanner = new Scanner(System.in);
           int selection = scanner.nextInt();
           if (selection == 1) {
               System.out.println("Wie viel geld möchten sie Einzahlen?");
               int value = scanner.nextInt();
               balance += value;
               System.out.println(value);
               System.out.println("Sie haben " + value + "€ eingezahlt!");
           }


           if (selection==2) {
               System.out.println("Wie viel Geld möchten sie abheben?");
               int value = scanner.nextInt();
               balance-=value;
               System.out.println(value);
               System.out.println("Sie haben " +value+ "€ abgehoben!" );
           }


           if (selection == 3) {
               System.out.println("Ihre Kontostand:" + balance +"€");
           }

           if (selection == 4) {
               System.out.println("Auf Wiedersehen!");
               isFinisched=true;
           }

       }
    }
}
