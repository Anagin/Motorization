package app;

import data.Car;
import data.Motorcycle;
import utils.DataReader;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Przemysław on 2017-03-09.
 */
public class FactoryApp {

    public static void main(String[] args) {
        final String appName = "CarFactory v0.1";

        List<Car> carList = new ArrayList<>();
        List<Motorcycle> motorcycleList = new ArrayList<>();
        DataReader dR = new DataReader();

        System.out.println("Application name: " + appName);
        System.out.println("Create car: ");
        carList.add(dR.readAndCreateCar());
        carList.add(dR.readAndCreateCar());

        System.out.println("Create motorcycle: ");
        motorcycleList.add(dR.readAndCreateMotorcycle());

        dR.close();
        Car.printInfo(carList);
        Motorcycle.printInfo(motorcycleList);
    }
}

