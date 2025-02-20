package at.buesra.projects.basics.games;

public class RechnerTest {
        public static void main(String[] args) {
            Rechner r  = new Rechner();
            int result = r.add(5,7);
            System.out.println(result);

            ScienceCalculator sc = new ScienceCalculator();
            int result1 = sc.wurzel(50);
            System.out.println(result1);

            double result2 = sc.sinus(60);
            System.out.println(result2);
        }

    }

