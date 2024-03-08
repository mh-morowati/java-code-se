package Models;

import carColor.CarColor;

public class Car {
    private String brand;
    private String model;
    private CarColor color;
    public static Integer counter = 0;

    static {
        counter = 2;
    }
    static {
        getCounter();
    }

    public Car() {
        counter++;
    }

    public Car(String brand, String model, CarColor color) {
        this();
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

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

    public CarColor getColor() {
        return color;
    }

    public void setColor(CarColor color) {
        this.color = color;
    }

    @Override
    public String toString() {

        return brand + " " + model + " " + color;
    }
   public static Integer getCounter(){

       return counter;
   }
}
