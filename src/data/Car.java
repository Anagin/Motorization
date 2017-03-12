package data;

/**
 * Created by Przemysław on 2017-03-09.
 */
public class Car extends Vehicle {

    public Car(String brand, String model, String body, int productionYear, String color) {
        super(brand, model, productionYear, color);
        this.body = body;
    }

    private String body;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        String printInfo= "Car{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", productionYear=" + getProductionYear() +
                ", color='" + getColor() + '\'' +
                '}';
        return printInfo;
    }
}
