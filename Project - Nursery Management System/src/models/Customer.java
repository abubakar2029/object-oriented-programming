package models;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    public String email;
    public List<Order> orderHistory;

    public Customer(String email) {
        this.email = email;
        this.orderHistory = new ArrayList<>();
    }

    public void viewOrderHistory() {
        System.out.println("\n========================= Order History of " + email+" =========");
        for (Order order : orderHistory) {
            System.out.println(order.toString());
        }
    }


    public void addOrder(Order newOrder) {
        orderHistory.add(newOrder);
    }

}
