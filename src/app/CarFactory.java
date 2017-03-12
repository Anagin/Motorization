package app;

import data.Car;
import utils.DataReader;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Przemysław on 2017-03-09.
 */
public class CarFactory {

    public static void main(String[] args) {
        final String appName = "CarShop v0.1";

        List<Car> carList = new ArrayList<>();
        DataReader dR = new DataReader();

        System.out.println("Application name: " + appName);
        System.out.println("Create car");
        carList.add(dR.readAndCreateCar());
        carList.add(dR.readAndCreateCar());

        dR.close();
        for (int i = 0; i < carList.size(); i++) {
            carList.get(i).printInfo();
        }
    }
}

