package at.buesra.projects.basics.OO11;

public class main {
    public static void main(String[] args) {
        Producer p1 = new Producer("Büsra","Austria",10);
        Producer p2 = new Producer("nejo","Bulgaria",20);
        Producer p3 = new Producer("Miray", "Turkey", 25);

        Engine e1 = new Engine(120,Engine.TYPE.BENZIN);

        Car c1 = new Car("blue",120, 18000,70,p2,e1);

        Truck t1 = new Truck("blue",100,12000,70,p1,e1,"trailer1");

        System.out.println(t1.getColor() + t1.getTrailer());
        t1.drive();
        t1.stop();
    }



}
