package models;

import Interfaces.Flyying;

public class Helicoopter extends Veihcle implements Flyying {
    @Override
    public void fly() {
        System.out.println("flying vertical then Horizontal");
    }
}
