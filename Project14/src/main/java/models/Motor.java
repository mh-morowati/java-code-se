package models;

import Interfaces.Dryvable;
import Interfaces.Lastic;

public class Motor extends Veihcle implements Dryvable, Lastic {
    @Override
    public void drive() {
        System.out.println("driving in the road");
    }

    @Override
    public void lastics() {
        System.out.println("two tire for motor");
    }
}
