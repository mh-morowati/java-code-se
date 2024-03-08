import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class mainApp {
    public static void main(String[] args) {
        String[][] books = new String[10][10];
        Double[] [] prices = new Double[10][10];
        try {
            System.out.println("کتابفروشی گلبرگ");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            //برای اینکه بعداز یکبار برنامه بسته نشه وهمیشه باشه کد whileروزدیم
            Integer rowindex = 0;
            while (true) {
                /*books[rowindex] = new String[10];
                prices[rowindex] = new Double[10];*/
                System.out.println("لطفا نام خریدار را وارد نمایید: (یابرای خروج عدد0را واردکنید)");
                String name = reader.readLine();
                if(name.equals("0")) break;
                // فقط وقتی یک خطه میتونیم {} نذاریم
                System.out.println("لطفاتعداد کتابهای انتخابی خودرا واردنمایید:");
                Integer count = Integer.valueOf(reader.readLine());
                Double totalPrice = 0d;
                for (Integer ind = 0; ind < count; ind++) {
                    System.out.println("لطفانام کتاب راواردنمایید:");
                    String bookName = reader.readLine();
                    System.out.println("لطفامبلغ کتاب را واردنمایید:");
                    Double price = Double.valueOf(reader.readLine());
                    totalPrice += price;

                    books[rowindex][ind] = bookName;
                    prices[rowindex][ind] = price;
                }
                System.out.println("مجموع فاکتورشما : " + totalPrice + "تومان");
                System.out.println("ازاینکه ازفروشگاه ماخرید کردید متشکرم " + name + " عزیز");
                rowindex++;
            }
            System.out.println("خدانگهدار");
        } catch (IOException e) {
            System.out.println("لطفامقادیردرست واردنمایید");
        }

    }
}
