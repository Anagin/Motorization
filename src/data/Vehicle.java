package data;

/**
 * Created by Przemysław on 2017-03-12.
 */
public abstract class Vehicle {
    private String brand;
    private String model;
    private int productionYear;
    private String color;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Vehicle(String brand, String model, int productionYear, String color) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", productionYear=" + productionYear +
                ", color='" + color + '\'' +
                '}';
    }
}
