package net.holosen.app;

import net.holosen.app.exceptions.carOutOfWeightException;
import net.holosen.app.models.car;


public class MainApp {
    public static void main(String[] args) {
        car bmw = new car("BMW","E46","Blue");
        bmw.horn();
        System.out.println(bmw);

        try {
            bmw.setWeight(40);
            System.out.println(bmw.getWeight());
        } catch (carOutOfWeightException e) {
            System.out.println("Please enter a weight less than 5!");
        }
        bmw.setMaxSpeed(350);
        bmw.setWheelCount(4);

    }

}
