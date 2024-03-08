import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class MainProject {
    public static int array = 56;
    public static String[] names = new String[array];
    public static String[] numbers = new String[array];
    public static String[] mobiles = new String[array];
    public static Boolean[] exitedList = new Boolean[array];
    public static Long[][] invoicePrices = new Long[array][array];
    public static String[][] invoiceTitle = new String[array][array];
    public static Integer currentIndex = 0;

    public static void main(String[] args) {
        try {

            LocalTime time1 = LocalTime.now();
            if (time1.getHour() < 8) {
                System.out.println("تایم کاری شروع نشده است!!");
            }
            dayMessage(LocalDateTime.now());
            // BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                showMenu();
                int menu = getMenu();
                switch (menu) {
                    case 1:
                        getRemain();
                        p("نام مالک خودرو راوارد نمایید:");
                        names[currentIndex] = getInput();
                        p("شماره پلاک خودروراواردنمایید:");
                        numbers[currentIndex] = getInput();
                        p("شماره موبایل راننده راواردنمایید:");
                        mobiles[currentIndex] = getInput();
                        exitedList[currentIndex] = false;
                        p("شماره شما: " + currentIndex);
                        currentIndex++;
                        break;
                    case 2:
                        Integer remain = 0, entered = 0, exited = 0;
                        for (Boolean b : exitedList) {
                            if (b == null)
                                remain++;
                            else if (b) exited++;
                            else
                                entered++;
                        }
                        System.out.println("ظرفیت باقیمانده: " + remain);
                        p("واردشده: " + entered);
                        p("خارج شده: " + exited);
                        break;
                    case 3:
                        p("لطفاشماره خودرا واردنمایید:");
                        Integer number = Integer.valueOf(getInput());
                        if (!checkNumberValidity(number)) {
                            p("شماره وجودندارد!!!");
                            break;
                        }
                        System.out.println("نام: " + names[number]);
                        p("شماره پلاک: " + numbers[number]);
                        p("شماره موبایل: " + mobiles[number]);
                        System.out.println("وضعیت: " + (exitedList[number] ? "سرویس شده" : "سرویس نشده!"));

                        break;
                    case 4:
                        p("لطفاشماره خودرا واردنمایید:");
                        Integer serviceNumber = Integer.valueOf(getInput());
                        if (!checkNumberValidity(serviceNumber)) {
                            p("شماره وجودندارد!!!");
                            break;
                        }
                        p("تعدادخدمات داده شده را واردنمایید:");
                        Integer workingCount = Integer.valueOf(getInput());
                        Long totalPrice = 0L;
                        for (int index = 0; index < workingCount; index++) {
                            p("عنوان فاکتوررا واردنمایید:");
                            invoiceTitle[serviceNumber][index] = getInput();
                            p("مبلغ فاکتوررا واردنمایید:");
                            invoicePrices[serviceNumber][index] = Long.valueOf(getInput());
                            totalPrice += invoicePrices[serviceNumber][index];
                        }
                        exitedList[serviceNumber] = true;
                        p("مبلغ کل فاکتورشما: " + totalPrice);
                        break;
                    case 0:
                        p("خداحافظ");
                        System.exit(0);

                }
            }
        } catch (IOException e) {
            p("خطادر ورودی!!");
        } catch (NumberFormatException e) {
            p("لطفا عدد درست وارد نمایید!!!");
        } catch (Exception e) {
            p("خطا!!!!");
        }
    }

    private static boolean checkNumberValidity(Integer number) {
        return number >= 0 && number <= array && number < currentIndex;
    }

    private static void dayMessage(LocalDateTime day) {
        switch (day.getDayOfWeek()) {
            case MONDAY -> {
                p("دوشنبه بخیر");
            }
            case TUESDAY -> {
                p("سه شنبه بخیر");
            }
            case WEDNESDAY -> {
                p("چهارشنبه بخیر");
            }
            case THURSDAY -> {
                p("پنجشنبه بخیر");
            }
            case FRIDAY -> {
                p("جمعه بخیر");
            }
            case SATURDAY -> {
                p("شنبه بخیر");
            }
            case SUNDAY -> {
                p("یکشنبه بخیر");
            }
        }
    }

    private static void p(String message) {
        System.out.println(message);
    }

    private static void showMenu() {
        p("menu:");
        p("1: ورود خودرو جدید ");
        p("2: باقیمانده و واردشده و خارج شده");
        p("3: نمایش جزییات خودرو");
        p("4: خروج خودرو");
        p("0: خروج");
    }

    private static int getMenu() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        p("لطفا گزینه موردنظررا واردکنید:");
        return Integer.parseInt(reader.readLine());
    }

    private static String getInput() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        return reader.readLine();
    }

    private static void getRemain() {
        int getRemain = array - currentIndex;
        if (getRemain == 0) {
            p("ظرفیت تکمیل شده!!!");
            return;
        }
    }
}

