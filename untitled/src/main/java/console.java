import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class console {
    public static void main(String[] args) {
        float num1 = 12.4f;
         int num2 = (int)  num1;
       // System.out.println(num2);
        Float num3 = 12.4f;
        Integer num4 = num3.intValue();
        //System.out.println(num4);
        char num5 = '1';
        int num6 = Integer.valueOf(String.valueOf(num5));
        //System.out.println(num6);
        double mem = 45.66665;
        int mem1 = (int)mem;
        float mem2 = (float) mem;
        System.out.println(mem1);
        System.out.println(mem2);
        char mem3 = '5';
        int mem4 = Integer.valueOf(String.valueOf(mem3));
        System.out.println(mem3);
        float dob = 9.555f;
        String dob1 = String.valueOf(Float.valueOf(dob));
        System.out.println(dob1);


    }
    }