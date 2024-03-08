import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Time;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

import static java.lang.System.exit;

public class MainApp {
 private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 private static final String[] numbers = new String[56];
 private static final String[] names = new String[56];
 private static final String[] mobiles = new String[56];
 static final Boolean[] exitedlist = new Boolean[56];
 private static final String [][] invoiceTitle = new String[56][56];
 private static final Long [][] invoicePrice = new Long[56][56];
 private static Integer currentIndex = 0;
    public static void main(String[] args) {        try {
        LocalDateTime day = LocalDateTime.now();
        if (day.getHour() < 8 ){
            System.out.println("تایم کاری شروع نشده است!!!");
            return;
        }

        System.out.println("خوش آمدید امروز: " + day);
        while (true) {
            currentIndex = getMenu(reader, numbers, currentIndex, names, mobiles, exitedlist, invoiceTitle, invoicePrice);

        }
        } catch (IOException e) {
            System.out.println("خطا");
        }

}

    private static Integer getMenu(BufferedReader reader, String[] numbers, Integer currentIndex, String[] names, String[] mobiles, Boolean[] exitedlist, String[][] invoiceTitle, Long[][] invoicePrice) throws IOException {
        Integer menunum = null;
        System.out.println("menu:");
        System.out.println("1:ورود خودرو جدید");
        System.out.println("2:نمایش ظرفیت و...");
        System.out.println("3:نمایش جزییات خودرو");
        System.out.println("4:خروج خودرو");
        System.out.println("0:خروج");
        menunum = Integer.valueOf(reader.readLine());
        switch (menunum) {
            case 1:
                if (currentIndex == 56) {
                    System.out.println("ظرفیت پرشده است!!!!");
                    break;
                }
                System.out.println("شماره پلاک خودرو راواردنمایید");
                String numbers1 = reader.readLine();
                numbers[currentIndex] = numbers1;
                System.out.println("نام مالک راواردنمایید");
                String names1 = reader.readLine();
                names[currentIndex] = names1;
                System.out.println("شماره موبایل راواردنمایید");
                String mobiles1 = reader.readLine();
                mobiles[currentIndex] = mobiles1;
               // Boolean exitedlist1 =Boolean.getBoolean(reader.readLine());
                exitedlist[currentIndex] = false;
                System.out.println("شماره شما: " + currentIndex);
                currentIndex++;

                break;

            case 2: Integer remain = 0,entered = 0,exited = 0;
            for (Boolean b : exitedlist){
                if(b == null)
                    remain++;
                else if(b)
                    exited++;
                else entered++;
            }
                System.out.println("ظرفیت باقیمانده: " + remain);
                System.out.println("تعداد وارد شده: " + entered);
                System.out.println("تعداد خارج شده: " + exited);

                break;
            case 3:
                System.out.println("لطفا شماره خودرا واردنمایید:");
                Integer number = Integer.valueOf(reader.readLine());
                System.out.println("نام: " + names[number] + "باپلاک: " + numbers[number] + "موبایل: " + mobiles[number]);

                currentIndex = getMenu(reader, numbers, currentIndex, names, mobiles, exitedlist, invoiceTitle, invoicePrice);
            case 4:
                System.out.println("لطفا شماره خودرا واردنمایید:");
                Integer number1 = Integer.valueOf(reader.readLine());
                System.out.println("تعداد خدمات راواردنمایید:");
                Integer workCount = Integer.valueOf(reader.readLine());
                int totalPrice = 0;
                for (int i = 0; i < workCount;i++){
                    System.out.println("نوع خدمات را واردنمایید:");
                    String invoiceTitle1 = reader.readLine();
                    invoiceTitle[number1][workCount]= invoiceTitle1;
                    System.out.println("قیمت خدمات راواردنمایید:");
                    Long invoicePrice1 = Long.valueOf(reader.readLine());
                    invoicePrice[number1][workCount] = invoicePrice1;
                    totalPrice += invoicePrice1;
                }
                exitedlist[number1] = true;
                System.out.println("مجموع کل پرداختی فاکتورشما: " + totalPrice + " تومان میباشد.");

                break;
            case 0:
               System.exit(0);
                System.out.println("خدانگهدار");

        }
        return currentIndex;
    }


   /* private static Integer getMenu(BufferedReader reader) throws IOException {
        Integer menunum;
        System.out.println("menu:");
        System.out.println("1:ورود خودرو جدید");
        System.out.println("2:نمایش ظرفیت و...");
        System.out.println("3:نمایش جزییات خودرو");
        System.out.println("4:خروج خودرو");
        System.out.println("0:خروج");
        menunum = Integer.valueOf(reader.readLine());
        return menunum;
    }*/

    private static int currentIndex() {
        return 0;
    }

    private static void exit() {

    }
}
