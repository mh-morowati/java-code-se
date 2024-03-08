package net.holosen.app;

import java.util.Scanner;

public class Mainapp {
    public static void main(String[] args) {
        try {

            System.out.println("سیستم استخدام شرکت گستر تهران");
            Scanner input = new Scanner(System.in);
            System.out.println("لطفا نام خودرا وارد نمایید:");
            String firstName = input.nextLine();
            System.out.println("لطفا نام خانوادگی خودرا وارد نمایید: ");
            String lastName = input.nextLine();
            System.out.println("لطفا سن خودرا وارد نمایید:");
            Short age = input.nextShort();
            System.out.println("لطفا حقوق درخواستی خودرا وارد نمایید:");
            System.out.println("(برای مثال عدد5 رابرای 5میلیون تومان وارد نمایید");
            System.out.println("و5000000 وارد نکنید)");
            Short salary = input.nextShort();
            String output = firstName + " " + lastName + " " + "عزیز," + "\n" +
                    " خوشحالیم ازاینکه شرکت مارا برای استخدام انتخاب کردید ," + "\n"
                    + "شرایط شرکت مابرای استخدام حقوق زیر 15میلیون وسن کمتر از 30سال است.";
            System.out.println(output);
        } catch (Exception e) {
            System.out.println("سن وحقوق خودرا باید به عدد وارد نمایید");
        }
    }

}

