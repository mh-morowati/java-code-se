package models;

import java.util.Scanner;

public class MainApp {
   public static Veihcle[] veihcles = new Veihcle[310];
    public static int index = 0;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       while (true) {
           System.out.println("شماره موردنظررا برای ساخت وسیله موردنظرواردکنید:");
           System.out.println("0. خروج");
           System.out.println("1. هواپیما");
           System.out.println("2. خودرو");
           System.out.println("3. کشتی");
           System.out.println("4. هلیکوپتر");
           System.out.println("5. موتور");
           Integer number = input.nextInt();
           if (number == 0) break;
           System.out.println("تعدادموردنیاز برای تولیدرا واردنمایید:");
           Integer count = input.nextInt();
           switch (number) {
               case 1:
                   for (int i = 0; i < count; i++) {
                       AirPlane a = new AirPlane();
                       a.setMotor("motor" + i);
                       veihcles[index] = a;
                       index++;
                   }

                   break;

               case 2:
                   for (int i = 0; i < count; i++) {
                       Car c = new Car();
                       c.setMotor("motor" + i);
                       veihcles[index] = c;
                       index++;
                   }
                   break;

               case 3:
                   for (int i = 0; i < count; i++) {
                       Ship s = new Ship();
                       s.setMotor("motor" + i);
                       veihcles[index] = s;
                       index++;
                   }
                   break;

               case 4:
                   for (int i = 0; i < count; i++) {
                       Helicoopter h = new Helicoopter();
                       h.setMotor("motor" + i);
                       veihcles[index] = h;
                       index++;
                   }
                   break;

               case 5:
                   for (int i = 0; i < count; i++) {
                       Motor m = new Motor();
                       m.setMotor("motor" + i);
                       veihcles[index] = m;
                       index++;
                   }
                   break;
           }

           if (veihcles[0] instanceof Motor) {
               Motor x = (Motor) veihcles[0];
           } else if (veihcles[0] instanceof AirPlane) {
               AirPlane x = (AirPlane) veihcles[0];
           }
       }
    }
}
