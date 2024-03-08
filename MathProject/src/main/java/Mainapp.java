import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Mainapp {
    public static void main(String[] args) {
        try {

            {  Scanner input = new Scanner(System.in);
            System.out.println("Please enter 'r' : ");
            Float r = input.nextFloat();
          //  double A = Math.PI * Math.pow(r,2);
            double A = Math.PI;
            A *= r;
            A *= r;
           // double P = 2 * Math.PI * r;
            double P = 2;
            P *=  Math.PI;
            P *= r;
            System.out.println("A = " + A);
            System.out.println("P = " + P);

//            c = SQRT(a^2 + b^2)

            double c2 = Math.sqrt(Math.pow(5,2) + Math.pow(9,2));

            /*double a2 = 5;
            a2 *= a2;
            double b2 = 9;
            b2 *= b2;
            double c2 = a2 + b2;
            c2 = Math.sqrt(c2);*/
           System.out.println(c2);}



        } catch (Exception e) {
            System.out.println("Please enter a valid number");


        }
    }
}