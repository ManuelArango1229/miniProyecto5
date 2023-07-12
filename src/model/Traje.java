package model;

public class Traje {

    public Traje(int id, String name, String origin, String material, double price) {
        this.id = id;
        this.name = name;
        this.origin = origin;
        this.material = material;
        this.price = price;
    }

    int id;
    String name;
    String origin;
    String material;
    private double price;
}
