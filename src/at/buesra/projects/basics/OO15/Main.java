package at.buesra.projects.basics.OO15;

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Animal(50,10);
        Animal a2 = new Animal(20,5);

        Zoo zoo = new Zoo("kinderzoo", "Wiesenrainstraße");
        zoo.addAnimal(a1);
        zoo.addAnimal(a2);



        Dog d1 = new Dog(40,20);
        zoo.addAnimal(d1);

        zoo.printAnimals();
        d1.bark();
    }
}
