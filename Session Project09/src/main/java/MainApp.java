import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {

        //region cars
        /*String[] cars = {"BMW", "BENZ", "MAZDA", "FORD", "SHEVERLOOT", "JUGVAR", "TESLA", "FERRARI", "LAMBORGINI"};
        cars[5] = "volvo";
        //System.out.println(cars[0]);
        System.out.println(cars.length);
        for (int i = 6; i < cars.length; i++) {
            System.out.println(cars[i]);
        }*/

        /*String[] cars = new String[5];
        cars[0] = "bmw";
        cars[1] = "benz";
        cars[2] = "ford";
        cars[3] = "volvo";
        cars[4]= "mazda";*/
        // System.out.println(cars[1]);
      /*  for (int i = 2; i < cars.length; i++){
            System.out.println(cars[i]);*/
        // }
        //for each
       /* for (String car : cars){
           System.out.println(car);
        }*/

        //endregion

        /*Integer[] num = {265, 3254, 89653, 3200, 4572, 326501, 789652, 326559888, 10232};

        for(int i = 5;i< num.length;i++){
            System.out.println(num[i]);*/
       // }

        int [][] numbers = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        for (int row = 0; row< numbers.length;row++){
            for (int col = 0;col<numbers[row].length;col++){
               // System.out.println(numbers[row][col]);
            }
        }
        for (int[] number : numbers) {
            for (int num : number){
                System.out.println(num);
            }
        }

        String [][] name = {
                {"mohammad","ali","goli"},
                {"zahra","java","narges"},
                {"jhon","amber","loki","hgfgfgf"}
        };
       // System.out.println(name[2][3]);

        for (int st = 0;st<name.length;st++){
            for (int bl = 0;bl<name[st].length;bl++){
               // System.out.println(name[st][bl]);
            }
        }
        for(String[] kjh : name){
          //  System.out.println((kjh));
        }
    }
}
