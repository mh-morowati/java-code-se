import Models.Car;
import carColor.CarColor;

public class MainApp {
    public static void main(String[] args) {
        System.out.println(Car.counter);
        Car bmw = new Car("BMW","E46", CarColor.Blue);
        Car benz = new Car("Benz", "SL500", CarColor.White);
        System.out.println(bmw);
        System.out.println(Car.counter);
        Car.getCounter();

       /* final Integer x = 100;
        x++;
        x += 100;*/
    }
}
