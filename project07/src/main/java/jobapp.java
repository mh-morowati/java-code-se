import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class jobapp {
    public static void main(String[] args) {        try {
        System.out.println("فروش اقساطی موبایل");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("شغل خودرا وارد نمایید:");
        String myJob = reader.readLine();
        System.out.println("لطفادرآمد ماهیانه خودرا وارد نمایید:");
        Integer myIncome = Integer.valueOf(reader.readLine());
        System.out.println("میزان پیش قسط پرداختی راوارد نمایید:");
        Integer prePayment = Integer.valueOf(reader.readLine());
        System.out.println("تعداد موبایل درخواستی را واردنمایید:");
        Integer requestNum = Integer.valueOf(reader.readLine());
        if (myIncome >= 6000000 || prePayment >= 3000000 || requestNum <= 4)
        {System.out.println("ثبت نام شما برای اعطای موبایل قسطی باموفقیت انجام شد \nبعداز بررسی صحت شرایط نتیجه به شما اعلام میگردد");}

        else{
            System.out.println("متاسفانه شماشرایط لازم برای دریافت قسطی موبایل را ندارید");
        }
    } catch (IOException e) {
        System.out.println("خطا!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");        }


    }

    }

