import java.util.Random;

public class whileloop {
    public static void main(String[] args) {

        //Erstelle ein Programm, dass Zufallszahlen zwischen 10 und 30 generiert.
        // Das Programm soll die Zufallszahlen zusammenzählen.
        // Sobald die Zahl 15 oder die Zahl 25 kommt, wird das Programm beendet und die Summe der vorherigen Zufallszahlen ausgegeben!
        int sum = 0;
        Random random = new Random();
        boolean isFinisched = false;

        while (!isFinisched) {
            int randomValue = random.nextInt(10, 31);
            sum = sum + randomValue;
            if ((randomValue == 15) || (randomValue == 25)) {
                System.out.println(sum);
                isFinisched=true;
            }

        }


    }
}
