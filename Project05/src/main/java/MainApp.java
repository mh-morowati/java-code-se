import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.text.NumberFormat;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {         try {

        System.out.println("سامانه استخدام");
        System.out.println("نام خودرا وارد نمایید:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String myName = reader.readLine();
        System.out.println("نام خانوادگی خودرا وارد نمایید:");
        String lastName = reader.readLine();
        System.out.println("سن خودرا وارد نمایید:");
        Integer age = Integer.valueOf(reader.readLine());
        System.out.println("نام پدر خودرا وارد نمایید:");
        String fatherName = reader.readLine();
        System.out.println("شماره تماس خودرا وارد نمایید:");
        Long myNumber = Long.valueOf(reader.readLine());
        System.out.println("حقوق درخواستی خودرا واردنمایید:");
        System.out.println("(حقوق خودرا بصورت یک عدد وارد کنید");
        System.out.println("مثلا بجای 5000000تومان عدد 5را وارد کنید)");
        Integer salary = Integer.valueOf(reader.readLine());
        System.out.println(myName + " " + lastName + " " + "عزیز\n" + "اطلاعات شما تکمیل گردید نتیحه از طریق تماس یا پیامک اعلام میشود");
        } catch (IOException e) {
        System.out.println("خطا دروارد کردن اطلاعات نام صحیح را بنویسید!!!!");
    } catch (NumberFormatException e) {
        System.out.println("خطا در ورودی لطفا عدد درست وارد کنید!!!!!!");
    } catch (Exception e) {
        System.out.println("خطا!!!!!!!");


    }
    }
}
