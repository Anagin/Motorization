/**
 * Created by Przemysław on 2017-03-09.
 */
public class Car {

        private String brand;
        private String model;
        private String version;
        private String body;
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

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
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

    public Car(String brand, String model, String version, String body, int productionYear, String color) {
        this.brand = brand;
        this.model = model;
        this.version = version;
        this.body = body;
        this.productionYear = productionYear;
        this.color = color;
    }

    public void printInfo(){
        String info;
        info="Brand: "+brand+", "+ "Model: "+model+", "+"Version: "+version+", "+
                "Body: "+body+", "+"Year: "+productionYear+", "+"Color: "+color;
        System.out.println(info);
    }
}
