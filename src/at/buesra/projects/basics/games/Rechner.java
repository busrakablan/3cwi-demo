package at.buesra.projects.basics.games;

public class Rechner {

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division durch Null ist nicht erlaubt.");
        }
        return a / b;
    }

    public double sin(double value) {
        return Math.sin(value);
    }

    public double cos(double value) {
        return Math.cos(value);
    }

    public double wurzel(double value) {
        if (value < 0) {
            throw new ArithmeticException("Keine Wurzel aus negativen Zahlen möglich.");
        }
        return Math.sqrt(value);
    }
}
}
