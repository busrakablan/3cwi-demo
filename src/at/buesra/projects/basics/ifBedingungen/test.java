package at.buesra.projects.basics.ifBedingungen;

public class test {
    //jede 3.Zahl, wenn die Zahl durch 4 teilbar ist nicht, -4inkl 150 excl.
    public static void main(String[] args) {
        for (int i = -4; i <150; i+=3) {
            if (i%4!=0){
                System.out.println(i);
            }
        }
    }
}
