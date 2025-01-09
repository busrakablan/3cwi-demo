package at.buesra.projects.basics.OO;

public class wheel {
    private String brand;
    private String positon;

    public wheel(String brand, String positon) {
        this.brand = brand;
        this.positon = positon;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPositon(String positon) {
        this.positon = positon;
    }


public void getBrandAndPos() {
    System.out.println("brand:  " + this.brand + "  positon:  " + this.positon);
}

}




