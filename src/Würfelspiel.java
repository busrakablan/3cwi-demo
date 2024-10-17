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
        System.out.println("Wilkommen zum Würfelspiel!");



        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean isfinished = false;


        while (!isfinished) {

            System.out.println("Du hast" + rounds +" Würfe");
            System.out.println("1.Spielen");
            int selection = scanner.nextInt();

            if (selection == 1) {

                    int randomnumber = random.nextInt(1, 6);
                    int randomnumber1 = random.nextInt(1, 6);
                    spieler1 += randomnumber;
                    spieler2 += randomnumber1;
                    rounds -= 1;

                    System.out.println("spieler1 hat " + randomnumber + " gewürfelt");
                    System.out.println("spieler2 hat " + randomnumber1 + " gewürfelt");

                if (rounds == 0) {
                    if (spieler1 > spieler2) {
                        System.out.println("spieler1 hat gewonnen");
                    } else if (spieler2 > spieler1) {
                        System.out.println("spieler2 hat gewonnen");
                    } else if (spieler1 == spieler2) {
                        System.out.print("Unentschieden");
                    } else {
                        System.out.println("Spiel beendet");
                    }
                }
                    }
                }

            }
        }









































