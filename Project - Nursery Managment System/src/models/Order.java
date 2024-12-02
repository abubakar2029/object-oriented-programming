package models;

import java.util.Date;
import java.util.List;

public class Order {
    private Date date;
    private float amount;
    private String customerEmail;
    private List<Plant> plantList;

    public Order(String date, float amount, String customerEmail, List<Plant> plantList) {
        this.date = new Date();
        this.amount = amount;
        this.customerEmail = customerEmail;
        this.plantList = plantList;
    }

    public void placeOrder() {

        System.out.println("Order placed on: " + date);
        System.out.println("Total Amount: $" + amount);
    }

    @Override
    public String toString() {
        return "Order [Date=" + date + ", Amount=" + amount + ", CustomerID=" + customerEmail + "]";
    }
}
