/**
 * Created by Przemysław on 2017-03-09.
 */
public class CarFactory {

    public static void main(String[] args) {
        final String appName = "CarShop v0.1";
        Car car1 = new Car("Audi", "A4", "B9", "sedan", 2017, "black");
        Car car2 = new Car("Opel", "Astra", "H", "hatchback", 2011, "white");

        System.out.println("Application name: "+appName);
        System.out.println("Available cars:");
        car1.printInfo();
        car2.printInfo();
    }
}
