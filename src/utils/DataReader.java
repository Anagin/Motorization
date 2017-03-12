package utils;

import data.Car;

import java.util.Scanner;

/**
 * Created by Przemysław on 2017-03-09.
 */
public class DataReader {
    private Scanner sc;

    public DataReader() {

        sc = new Scanner(System.in);
    }

    public void close() {

        sc.close();
    }

    public Car readAndCreateCar() {
        System.out.println("Brand: ");
        String brand = sc.nextLine();
        System.out.println("model: ");
        String model = sc.nextLine();
        System.out.println("Version: ");
        String version = sc.nextLine();
        System.out.println("Body: ");
        String body = sc.nextLine();
        System.out.println("Production year: ");
        int productionYear = sc.nextInt();
        System.out.println("Color: ");
        String color = sc.nextLine();
        sc.nextLine();

        return new Car(brand, model, version, body, productionYear, color);
    }

}
