import java.util.Random;
import java.util.Scanner;

public class Würfelspiel {
    public static void main(String[] args) {
        //Erstelle ein Würfelspiel! Du spielst gegen den Computer.
        // Wenn das Spiel startet (mit einem kleinen Menü), hat der Spieler 6 Würfe. //Er spielt dabei gegen den Computer.
        // Wenn die Augensumme höher ist als jene des Computers hat der Spieler gewonnen, ansonsten der Computer.

        int spieler1 = 0;
        int spieler2 = 0;
        int rounds = 6;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean isfinished = false;


        while (!isfinished) {
            System.out.println("1.Spielen");
            int selection = scanner.nextInt();

            if (selection == 1) {
                int randomnumber = random.nextInt(1, 6);
                int randomnumber1 = random.nextInt(1, 6);
                spieler1 += randomnumber;
                spieler2 += randomnumber1;
                rounds -= 1;

                System.out.println(randomnumber);
                System.out.println(randomnumber1);

                if



            }
        }


    }
}






































