import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mainapp {
    public static void main(String[] args) throws IOException {

        //region if-else
        {
            int num1 = 100, num2 = 200;
            if (num1 < num2) {
                System.out.println(num1 + "<" + num2);
            } else if (num1 > num2) {
                System.out.println(num1 + ">" + num2);
            } else {//num1 == num2
                System.out.println(num1 + "==" + num2);
            }
        }
        //endregion

        //region switch

        int number = 1;
        switch (number) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            default:
                System.out.println(number);
                break;
        }
        //endregion

        //region for loop
       /* {
            Integer sum = 0;
            int max = 3;
            for (int i = 0; i < max; i++) {
            System.out.println("Please enter a number between 1 and 5 :");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            Integer number1 = Integer.parseInt(reader.readLine());
            sum += number1;
            switch (number1) {
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                default:
                    System.out.println(number1);
                    break;
            }

            }
            System.out.println("sum = " + sum);
        }*/
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        //endregion

        //region while loop
        {
       /*     int i = 0;
            int max = 0;*/
          /* while (i < max){
               System.out.println(++i);
           }*/
         /*   do {
                max = 5;
                System.out.println(++i);
            } while (i < max);*/
            int i = 0;
            int max = 100;
            while (true){
                if(i++ % 10 != 0)
                    continue;
                System.out.println((i - 1));
                if (i >= max)
                    break;

            }
            int x = 10;
        }
        // endregion
    }
}
