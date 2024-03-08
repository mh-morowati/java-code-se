import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.function.Supplier;

public class mainShow {

    //regionVariables
    private static final int maxService = 56;
private static String[] numbers = new String[maxService];
private static String[] names = new String[maxService];
private static String[] mobiles = new String[maxService];
private static Boolean[] exitedlist = new Boolean[maxService];
private static String [][] invoiceTitle = new String[maxService][];
private static Long [][] invoicePrice = new Long[maxService][];
private static int currentIndex = 0;

//endregion
    public static void main(String[] args) { try {

        LocalDateTime now = LocalDateTime.now();
        if (now.getHour() < 8){
            print("تایم کاری شروع نشده است!!!");
            return;
        }
        showDayMessage(now);
        while (true){
            showMenu();
            int menu = getMenu();
            switch (menu) {
                case 1:
                    enterCarMenu();
                    break;
                case 2:
                    showRemainMenu();
                    break;
                case 3:
                    showDetailsMenu();
                    //?if     :else
                    break;
                case 4:
                    exitCarMenu();
                    break;
                case 0:
                    print("خداحافظ!");
                    return;
            }
            }
        } catch (IOException e) {
        System.out.println("خطا در دریافت ورودی");
    } catch (NumberFormatException e) {
        print("لطفا عدد درست وارد کنید!!");
    } catch (Exception e) {
        print("خطا!!!");
    }
    }

    private static void exitCarMenu() throws IOException {
        print("لطفاشماره خودرا واردنمایید: ");
        Integer serviceNumber = Integer.valueOf(getInput());
        if (!checkNumberValidity(serviceNumber)){
            print("شماره شماوجودندارد!");
            return;
        }
        print("لطفاتعداد خدمات را واردنمایید: ");
        Integer invoiceItemCount = Integer.valueOf(getInput());
        Long totalPrice = 0L;
        invoiceTitle[serviceNumber] = new String[invoiceItemCount];
        invoicePrice[serviceNumber] = new Long[invoiceItemCount];
        for (int index = 0; index <invoiceItemCount; index++){
            print("[" +(index + 1) + "لطفاعنوان فاکتورراواردنمایید: [");
            invoiceTitle[serviceNumber][index] = getInput();
            print("[" +(index + 1) + "لطفامبلغ فاکتورراواردنمایید: [");
            invoicePrice[serviceNumber][index] = Long.valueOf(getInput());
            totalPrice += invoicePrice[serviceNumber][index];
        }
        exitedlist[serviceNumber] = true;
        print("مبلغ کل فاکتور: " + totalPrice);
    }

    private static void showDetailsMenu() throws IOException {
        print("لطفاشماره خودرا واردنمایید: ");
        Integer number = Integer.valueOf(getInput());
        if (!checkNumberValidity(number)){
            print("شماره شماوجودندارد!");
            return;
        }
        print("شماره: " + numbers[number]);
        print("نام: " + names[number]);
        print("موبایل: " + mobiles[number]);
        System.out.println("وضعیت: " + (exitedlist[number] ? "سرویس شده" : "سرویس نشده!") );
    }

    private static void showRemainMenu() throws IOException {
        int remain = maxService - currentIndex;
        int exited = 0, entered = 0;
        for (Boolean item : exitedlist){
            if (item == null) continue;
            else if (item) exited++;
            else entered++;
        }
        print("باقیمانده ظرفیت: " + remain);
        print("سرویس نشده: " + entered);
        print("سرویس شده: " + exited);
    }

    private static void enterCarMenu() throws IOException {
        int remain2 = maxService - currentIndex;
        if (remain2 == 0){
            print("ظرفیت تکمیل شده!!");
            return;
        }
        print("لطفاشماره پلاک خودرورا واردنمایید: ");
        numbers[currentIndex] = getInput();
        print("لطفانام مالک خودرورا واردنمایید: ");
        names[currentIndex] = getInput();
        print("لطفاشماره موبایل راننده راواردنمایید: ");
        mobiles[currentIndex] = getInput();
        exitedlist[currentIndex]= false;
        print("شماره شما برای خروج: " + currentIndex);
        currentIndex++;
    }

    private static boolean checkNumberValidity(Integer serviceNumber) {
        return serviceNumber >= 0 && serviceNumber <= maxService && serviceNumber < currentIndex;
    }

    private static int getMenu() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
           // Integer menu =
            return Integer.valueOf(reader.readLine());
        } catch (IOException e) {
        }
        return 0;
    }

    private static void showMenu() {
        print("لطفا گزینه موردنظررابرای ادامه انتخاب کنید: ");
        print("1:ورود خودرو جدید");
        print("2:نمایش ظرفیت و...");
        print("3:نمایش جزییات خودرو");
        print("4:خروج خودرو");
        print("0:خروج");
    }

    private static void showDayMessage(LocalDateTime date){
        switch (date.getDayOfWeek()){
            case MONDAY -> {
                print("دوشنبه بخیر");
            }
            case TUESDAY -> {
                print("سه شنبه بخیر");
            }
            case WEDNESDAY -> {
                print("چهارشنبه بخیر");
            }
            case THURSDAY -> {
                print("پنجشنبه بخیر");
            }
            case FRIDAY -> {
               print("جمعه بخیر");
            }
            case SATURDAY -> {
                print("شنبه بخیر");
            }
            case SUNDAY -> {
                print("یکشنبه بخیر");
            }
        }

    }

    private static void print(String message){
        System.out.println(message);
    }

    private static String getInput() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            // Integer menu =
            return reader.readLine();
        } catch (IOException e) {
        }
        return "";
}

}
