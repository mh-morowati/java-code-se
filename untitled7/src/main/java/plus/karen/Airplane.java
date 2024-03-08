package plus.karen;

import net.holosen.app.models.Vehicle;

public class Airplane extends Vehicle {
    public void fly(){
        System.out.println("flying with " + getMaxSpeed());
    }
}
