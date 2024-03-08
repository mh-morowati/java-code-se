package net.holosen.app.models;

import net.holosen.app.exceptions.carOutOfWeightException;

/**
 * car class for creating your car object
 */
public class car extends Vehicle {
    private String model;
    private String brand;
    private String color;
    private int weight;

public car(){
}
    public car(String brand, String model, String color) {
        this();
        this.brand = brand;
        this.model = model;
        this.color = color;
    }
    @Override
    public void horn() {
        System.out.println("beep beep");
    }

    public String getModel() {
        if (model == null)
            model = "_";
        return model;
    }

    /**
     * set your car`s model
     */
    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) throws carOutOfWeightException {
        if (weight > 5) {
            throw new carOutOfWeightException();
        }
        this.weight = weight;
    }
    public void method1(){
        System.out.println("m1");
    }
public Integer method1(String message){
    System.out.println(message);

    return 0;
}
    public Integer method1(String message, Integer x) {
        System.out.println(message);
        return x;
    }
    public void drive(){
        System.out.println("Driving with " + getMaxSpeed());
    }

    @Override
    public String toString() {
      return brand + " " + model+ " " + color;
    }
}

