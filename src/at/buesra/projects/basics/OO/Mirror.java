package at.buesra.projects.basics.OO;

public class Mirror {
    private int size;
    private int position;

    public Mirror(int size, int position) {
        this.size = size;
        this.position = position;
    }


    public void setSize(int size) {
        this.size = size;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void getPosAndSize(){
        System.out.println("size: " + this.size + "\tposition: " + this.position);
    }
}
