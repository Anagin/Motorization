package data;

/**
 * Created by Przemysław on 2017-03-12.
 */
public class Motorcycle extends Vehicle{
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Motorcycle(String brand, String model, String type, int productionYear, String color) {
        super(brand, model, productionYear, color);
        this.type = type;
    }


    @Override
    public String toString() {
        String printInfo= "Motorcycle{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\''+
                ", type='" + type + '\'' +
                ", productionYear=" + getProductionYear() +
                ", color='" + getColor() + '\'' +
                '}';
        return printInfo;
    }

}
