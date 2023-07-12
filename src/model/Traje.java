package model;


public class Traje {

    public Traje(String name, String origin, String material, double price) {
        this.name = name;
        this.origin = origin;
        this.material = material;
        this.price = price;
    }
    
    String name;
    String origin;
    String material;
    private double price;
}
