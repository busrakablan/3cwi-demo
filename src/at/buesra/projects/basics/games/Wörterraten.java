package at.buesra.projects.basics.games;

import java.util.Random;
import java.util.Scanner;

public class Wörterraten {
    public static void main(String[] args) {

        String[] woerter = {"hello", "Blume", "Sakarya"};

        Random random = new Random();
        String zufall = woerter[random.nextInt(woerter.length)];

        char[] erratenesWort = new char[zufall.length()];
        for (int i = 0; i < erratenesWort.length; i++) {
            erratenesWort[i] = '*';
        }
        Scanner scanner = new Scanner(System.in);
        boolean raten = false;

        System.out.println("Geben sie bitte Buchstaben an");
        while (!raten) {
            System.out.println("Wort:" + String.valueOf(erratenesWort));
            char eingabe = scanner.next().charAt(0);

            boolean buchstabegefunden = false;
            for (int i = 0; i < zufall.length(); i++) {
                if (zufall.charAt(i) == eingabe) {
                    erratenesWort[i] = eingabe;
                    buchstabegefunden = true;
                }

            }

            if (!buchstabegefunden) {
                System.out.println("falsche Buchstabe");
            }

            if (String.valueOf(erratenesWort).equals(zufall)) {
                raten = true;
                System.out.println("Sie haben den Wort " + zufall + " richtig erraten!");
            }
        }

scanner.close();
    }
}
