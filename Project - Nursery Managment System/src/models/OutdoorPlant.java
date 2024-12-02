package models;

public class OutdoorPlant extends Plant {
    private String wateringFrequency;

    public OutdoorPlant(String name, float price, String category, String wateringFrequency) {
        super(name, price, category);
        this.wateringFrequency = wateringFrequency;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Watering Frequency: " + wateringFrequency);
    }

    // Getters
    public String getWateringFrequency() {
        return wateringFrequency;
    }

    //    Setters
    public String setWateringFrequency(String wateringFrequency) {
        this.wateringFrequency = wateringFrequency;
        return wateringFrequency;
    }
}
