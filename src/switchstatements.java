import java.util.Random;

public class switchstatements {
    public static void main(String[] args) {
        // Erstelle eine Zufallszahl zwischen 5 und 10

        Random random = new Random();

        int randomnumber1 = random.nextInt(5,10);

        System.out.println(randomnumber1);
        // Wenn der Wert 10 ist gib aus Ten
        // Wenn der Wert 9 ist gib aus Nine
        // Wenn der Wert 8 ist gib aus Eight

        switch (randomnumber1){
            case 10:
                System.out.println("Ten");
                break;

            case 9:
                System.out.println("Nine");
                break;

            case 8:
                System.out.println("Eight");
                break;
            default:
                System.out.println("other value");
                break;

        }

    }
}
