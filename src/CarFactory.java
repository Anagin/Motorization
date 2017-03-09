/**
 * Created by Przemysław on 2017-03-09.
 */
public class CarFactory {

    public static void main(String[] args) {
        final String appName = "CarShop v0.1";
        Car[] cars = new Car[1000];
        cars[0] = new Car("Audi", "A4", "B9", "sedan", 2017, "black");
        cars[1] = new Car("Opel", "Astra", "H", "hatchback", 2011, "white");

        System.out.println("Application name: "+appName);
        System.out.println("Available cars:");
        for(int i=0; i<cars.length; i++) {
            cars[i].printInfo();
        }
    }
}
