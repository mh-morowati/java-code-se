import java.util.Scanner;

public class Mainapp {
    public static void main(String[] args) {

        try {

            System.out.println("سیستم استخدام شرکت گستر تهران");
            Scanner asdf = new Scanner(System.in);
            System.out.println("لطفا نام خودرا وارد نمایید:");
            String firstName = asdf.nextLine();
            System.out.println("لطفا نام خانوادگی خودرا وارد نمایید: ");
            String lastName = asdf.nextLine();
            System.out.println("لطفا سن خودرا وارد نمایید:");
            Short age = asdf.nextShort();
            System.out.println("لطفا حقوق درخواستی خودرا وارد نمایید:");
            System.out.println("(برای مثال عدد5 رابرای 5میلیون تومان وارد نمایید");
            System.out.println("و5000000 وارد نکنید)");
            Short salary = asdf.nextShort();
            String output = firstName + " " + lastName + " " + "عزیز," + "\n" +
                    " خوشحالیم ازاینکه شرکت مارا برای استخدام انتخاب کردید ," + "\n"
                    + "شرایط شرکت مابرای استخدام حقوق زیر 15میلیون وسن کمتر از 30سال است.";
            System.out.println(output);
        } catch (Exception e) {
            System.out.println("سن وحقوق خودرا باید به عدد وارد نمایید");
        }
    }
}
