package at.buesra.projects.basics;

public class Final {
        final int ZAHL = 10; // Diese Zahl bleibt immer 10
        void zeigen() {
            // ZAHL = 20; // Fehler! Wir können den Wert nicht ändern
            System.out.println("Die Zahl ist: " + ZAHL);
        }
    }

