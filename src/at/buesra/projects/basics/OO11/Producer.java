package at.buesra.projects.basics.OO11;

public class Producer {
    private String name;
    private String country;
    private int rabatt;

    public static void add(Producer producer) {
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public int getRabatt() {
        return rabatt;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setRabatt(int rabatt) {
        this.rabatt = rabatt;
    }

    public Producer(String name, String country, int rabatt) {
        this.name = name;
        this.country = country;
        this.rabatt = rabatt;
    }
}

