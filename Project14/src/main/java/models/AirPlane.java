package models;

import Interfaces.Dryvable;
import Interfaces.Flyying;
import Interfaces.Lastic;

public class AirPlane extends Veihcle implements Dryvable, Flyying, Lastic {
    @Override
    public void drive() {
        System.out.println("driving in the Airport");
    }

    @Override
    public void fly() {
        System.out.println("flying in the sky");
    }

    @Override
    public void lastics() {
        System.out.println("tree air tire ");
    }
}
