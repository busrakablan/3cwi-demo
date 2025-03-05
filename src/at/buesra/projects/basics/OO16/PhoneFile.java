package at.buesra.projects.basics.OO16;

public class PhoneFile {
    public static int size;
    private String name;

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public PhoneFile(int size, String name) {
        this.size = size;
        this.name = name;


    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setName(String name) {
        this.name = name;
    }
}
