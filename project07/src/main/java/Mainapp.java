import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mainapp {
    public static void main(String[] args) {        try {

        System.out.println("استخدام شرکت نرم افزاری رادان");
        System.out.println("لطفا نام ونام خانوادگی خودرا وارد نمایید :");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String myName = reader.readLine();
        System.out.println(" لطفا سن خودرا وارد نمایید: ");
        System.out.println("(برای استخدام سن شما باید 22-35 باشد)");
            Integer myAge = Integer.valueOf(reader.readLine());
        if(myAge >= 22 && myAge <= 35);
            else {
            System.out.println("شما شرایط سنی لازم برای شرکت دراستخدام راندارید!!!!");
        }
        System.out.println(" لطفا مدرک تحصیلی خودرا وارد نمایید");
        String myDegree = reader.readLine();
        if(myDegree == "لیسانس" || myDegree ==  "فوق لیسانس" || myDegree == "دکترا" || myDegree == "دکتری");
            else {
            System.out.println("مدرک شما پایین تر از حدلازم است");}
        System.out.println("لطفا شهرمحل سکونت خودرا وارد نمایید:");
        System.out.println("(برای استخدام باید ساکن تهران باشید)");
        String myCity = reader.readLine();
        if(myCity == "تهران");
            else {
            System.out.println("شماشرایط لازم برای شرکت دراستخدام راندارید");}
        System.out.println("سابقه کاری خودرا به سال وارد نمایید:");
        System.out.println("(حداقل سابقه کاری باید4سال باشد)");
        Integer myWorkYears = Integer.valueOf(reader.readLine());
        if(myWorkYears >= 4);
        else {
            System.out.println("شماسابقه کاری لازم برای شرکت در استخدام را ندارید");}
        System.out.println("حقوق درخواستی خودرا بصورت عدد 1-2رقمی وارد نمایید:");
        System.out.println("(برای مثال بجای 5میلیون عدد5را وارد نمایید)");
        Integer mySalary = Integer.valueOf(reader.readLine());
        if (mySalary <= 20);
        else {
            System.out.println("حقوق درخواستی بیش از میزان مجازاست");}
String outPut = myName + " " + "عزیز\n" + "اطلاعات شماثبت گردید درصورت واجدشرایط بودن باشما تماس میگیریم.";
        System.out.println(outPut);
        } catch (IOException e) {
        System.out.println("لطفا ورودی درست وارد کنید!!!!");
    } catch (NumberFormatException e) {
        System.out.println("لطفا عدد درست را واردکنید!!!!!!! ");
    } catch (Exception e) {
        System.out.println("خطا!!!!!!!!!!!!");


    }

    }
}
