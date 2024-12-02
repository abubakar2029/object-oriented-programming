package models;

public class IndoorPlant extends Plant {
    private String lightRequirement;
    private String temperature;

    public IndoorPlant(String name, float price, String category, String lightRequirement, String temperature, String maintainencelevel) {
        super(name, price, category);
        this.lightRequirement = lightRequirement;
        this.temperature = temperature;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("\nName: " + this.name + "\n Price: " + this.price + "\nCategory: " + this.category + "\ntemperature: " + this.temperature);
    }

    // Getters
    public String getLightRequirement() {
        return lightRequirement;
    }

    public String getTemperature() {
        return temperature;
    }

    //    Setters
    public String setLightRequirement(String lightRequirement) {
        this.lightRequirement = lightRequirement;
        return lightRequirement;
    }

    public String setTemperature(String temperature) {
        this.temperature = temperature;
        return temperature;
    }
}
