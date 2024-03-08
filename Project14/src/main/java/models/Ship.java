package models;

import Interfaces.Dryvable;

public class Ship extends Veihcle implements Dryvable {
    @Override
    public void drive() {
        System.out.println("driving in the sea");
    }
}
