package utils;

import data.Car;
import data.Motorcycle;

import java.util.InputMismatchException;
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
        int productionYear=0;
        System.out.println("Car brand: ");
        String brand = sc.nextLine();
        System.out.println("model: ");
        String model = sc.nextLine();
        System.out.println("Body: ");
        String body = sc.nextLine();
        System.out.println("Production year: ");

        boolean wrongYearProductionInput = true;
        while(wrongYearProductionInput) {
            try {
                productionYear = sc.nextInt();
                wrongYearProductionInput=false;
            } catch (InputMismatchException ex) {
                System.out.println("The value is not an int, Type it one more time!");
                sc.nextLine();
            }
        }
        System.out.println("Color: ");
        String color = sc.nextLine();
        sc.nextLine();

        return new Car(brand, model, body, productionYear, color);
    }

    public Motorcycle readAndCreateMotorcycle() {
        int productionYear = 0;
        System.out.println("Motorcycle brand: ");
        String brand = sc.nextLine();
        System.out.println("model: ");
        String model = sc.nextLine();
        System.out.println("Type: ");
        String type = sc.nextLine();
        System.out.println("Production year: ");
        boolean wrongYearProductionInput = true;
        while(wrongYearProductionInput) {
            try {
                productionYear = sc.nextInt();
                wrongYearProductionInput= false;
            } catch (InputMismatchException ex) {
                System.out.println("The value is not an int, type in one more time!");
                sc.nextLine();
            }
        }
        System.out.println("Color: ");
        String color = sc.nextLine();
        sc.nextLine();

        return new Motorcycle(brand, model, type, productionYear, color);
    }

}
