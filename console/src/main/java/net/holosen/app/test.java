package net.holosen.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        //region Arithmetic Operators
        System.out.println("================================================================");
        System.out.println("============Arithmetic Operators================================");
        System.out.println("================================================================");
        {
            int num1 = 100, num2 = 200, sum = 0;
            sum = num1 + num2;
            System.out.println("sum of" + num1 + ", " + num2 + "equals " + sum);
            int minus = num2 - num1;
            System.out.println("subtraction of" + num2 + ", " + num1 + "equals " + minus);
            System.out.println("subtraction of" + num1 + ", " + num2 + "equals " + (num1 - num2));
            float fNum1 = 1.5f + num1;
            double dNum1 = 100000000 + num1;
            double d = fNum1 + dNum1;
            String firstName = "muhammad", lastName = "morowati", fullName = "";
            fullName = firstName + " " + lastName;
            System.out.println("full name = " + fullName);
            String n1 = "1", n2 = "2";
            String n3 = n1 + n2;
            int n3Int = Integer.valueOf(n1) + Integer.valueOf(n2);
            System.out.println(" n3 = " + n3);
            System.out.println("n3Int = " + n3Int);
            int div = num2 / num1;
            System.out.println("Divisin of " + num2 + "and" + num1 + "equals" + div);
            int mul = num1 * num2;
            System.out.println("Multiply of " + num2 + "and" + num1 + "equals" + mul);
            int mod = num2 % num1;
            System.out.println("Modulus of " + num2 + "and" + num1 + "equals" + mod);
            System.out.println("Modulus of " + 125 + "and" + 23 + "equals" + (125 % 23));
        }

        //endregion

        //region Relation Operators
        System.out.println("================================================================");
        System.out.println("============Assignment Operators================================");
        System.out.println("================================================================");

        {
            int num1 = 100, num2 = 200, num3 = 0;
            num3 += num1;
            //num3 = num3 + num1;
            num3 *= num2;
            System.out.println(num3);
            num3 /= num1;
            System.out.println(num3);
            num3 %= num2;
            System.out.println(num3);
        }
        //endregion

        //region Unary Operators
        System.out.println("================================================================");
        System.out.println("============Unary Operators================================");
        System.out.println("================================================================");
        {
            int a = +100, b = +200;
            System.out.println("a++" + (a++));
            System.out.println("a++" + (a++));
            System.out.println("a++" + (a++));
            System.out.println("a++" + (a++));
            System.out.println("a++" + (a++));
            System.out.println("a++" + (a++));
            System.out.println("a++" + (a++));
            System.out.println("++a" + (++a));
            System.out.println("++a" + (++a));
            System.out.println("++a" + (++a));
            System.out.println("++a" + (++a));
            System.out.println("++a" + (++a));
            System.out.println("++a" + (++a));
            System.out.println("++a" + (++a));
            System.out.println("++a" + (++a));
            System.out.println("b--" + (b--));
            System.out.println("b--" + (b--));
            System.out.println("b--" + (b--));
            System.out.println("b--" + (b--));
            System.out.println("b--" + (b--));
            System.out.println("b--" + (b--));
            System.out.println("b--" + (b--));
            System.out.println("--b" + (--b));
            System.out.println("--b" + (--b));
            System.out.println("--b" + (--b));
            System.out.println("--b" + (--b));
            System.out.println("--b" + (--b));
            System.out.println("--b" + (--b));
            System.out.println("--b" + (--b));
            System.out.println("--b" + (--b));
            System.out.println("b--" + (b--));
            boolean boolean1 = true, boolean2 = !boolean1;
            System.out.println(boolean1);
            System.out.println(boolean2);

            //endregion

            //region logical Operators
        }
        System.out.println("================================================================");
        System.out.println("============logical Operators================================");
        System.out.println("================================================================");
        {
            int num1 = 10000, num2 = 12540, num3 = 500;
            System.out.println((num1 > num2) && (num1 > num3));
            //  هستor این || علامت
            System.out.println((num1 > num2) || (num1 > num3));

           // endregion


            System.out.println("================================================================");
            System.out.println("============logical Operators================================");
            System.out.println("================================================================");

            boolean bol1 = true;
          //  System.out.println(!bol1);

            String s1 = "Hossein", s2 = "";
           s2 += "Hos";
            s2 +="sein";
            System.out.println(s1 == s2);
            System.out.println(s1.equals(s2));

            String lui = "qwertyui", opi = "qwer";
          //  opi += "qwer";
            opi += "tyui";
            System.out.println(lui == opi);
            System.out.println( lui.equals(opi));
        }

    }

}