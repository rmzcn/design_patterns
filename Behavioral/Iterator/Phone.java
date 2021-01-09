package Behavioral.Iterator;

public class Phone {
    public String brand;
    public String model;
    public double price;

    public Phone(){ }
    public Phone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void call(){
        System.out.println("Phone is calling...");
    }
}
