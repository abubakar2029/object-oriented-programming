import models.*;
import enums.*;
import java.util.Scanner;

public class Main {

    public static void line() {
        System.out.println("══════════════════════════════════════════════════════");
    }

    public static void section(String title) {
        System.out.println("\n┌────────────────────────────────────────────────────┐");
        System.out.printf("│ %-50s │\n", title);
        System.out.println("└────────────────────────────────────────────────────┘");
    }

    public static void success(String msg) {
        System.out.println("   ✅ " + msg);
    }

    public static void input(String msg) {
        System.out.print("   ➤ " + msg);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        NurseryManager manager = NurseryManager.getInstance();
        Inventory inventory = Inventory.getInstance();

        line();
        System.out.println("🌿        NURSERY MANAGEMENT SYSTEM        🌿");
        line();

        section("Plant Setup");

        input("How many plants would you like to add? ");
        int numPlants = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numPlants; i++) {

            System.out.println("\n🌱 Adding Plant #" + (i + 1));

            input("Plant type (1 = Indoor, 2 = Outdoor): ");
            int type = sc.nextInt();
            sc.nextLine();

            input("Plant name: ");
            String name = sc.nextLine();

            input("Plant price: ");
            float price = sc.nextFloat();
            sc.nextLine();

            Plant plant;

            if (type == 1) {

                input("Light requirements (LOW / MEDIUM / HIGH): ");
                String lightStr = sc.nextLine().toUpperCase();
                PlantLightRequirements light = PlantLightRequirements.valueOf(lightStr);

                input("Temperature range: ");
                String temp = sc.nextLine();

                plant = new IndoorPlant(name, price, PlantCategory.INDOOR, light, temp);

            } else {

                input("Watering frequency (LOW / MEDIUM / HIGH): ");
                String waterStr = sc.nextLine().toUpperCase();
                PlantWateringFrequency water = PlantWateringFrequency.valueOf(waterStr);

                plant = new OutdoorPlant(name, price, PlantCategory.OUTDOOR, water);
            }

            manager.addPlant(plant, inventory);
            success("Plant added successfully!");
        }

        section("Customer Information");

        input("Customer email: ");
        String email = sc.nextLine();

        Customer customer = new Customer(email);

        section("Order Processing");

        Order order = new Order(customer.email, inventory.getPlantList());
        customer.addOrder(order);

        success("Order placed successfully!");

        section("Reports");

        ReportGenerator reportGenerator = new ReportGenerator();
        reportGenerator.generateInventoryReport();

        section("Customer Order History");

        customer.viewOrderHistory();

        line();
        System.out.println("🌿  Thank you for using the Nursery Management System!");
        line();

        sc.close();
    }
}