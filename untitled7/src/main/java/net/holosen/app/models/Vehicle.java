package net.holosen.app.models;

public class Vehicle {
    private int wheelCount;
    private int maxSpeed;

    public int getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void horn() {
        System.out.println("Boooooooooooogh");
    }
}
