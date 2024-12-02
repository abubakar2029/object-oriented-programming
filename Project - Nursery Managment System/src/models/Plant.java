package models;

public class Plant {
    protected String name;
    protected double price;
    protected String category;

    public Plant(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public void displayInfo() {
        System.out.println("Plant: " + name);
        System.out.println("Price: " + price);
        System.out.println("Category: " + category);
    }

    // Getters and Setters
    public String getName() { return name; }
    public double getPrice() { return price; }
    public String getCategory() { return category; }
}
