package models;

import Interfaces.Dryvable;
import Interfaces.Lastic;

public class Car extends Veihcle implements Lastic, Dryvable {
    @Override
    public void drive() {
        System.out.println("driving in the road");
    }

    @Override
    public void lastics() {
        System.out.println("five tire for car");
    }
}
