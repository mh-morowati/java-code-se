import java.io.IOException;
import java.util.Scanner;

public class MainApp {
private static User[] users = new User[100];
private static Integer index = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            p("گزینه موردنظررا انتخاب کنید:");
            p("1: ثبت نام");
            p("2: ورود");
            p("0: خروج");
            Integer menu = input.nextInt();
            Integer userIndex;
            switch (menu) {
                case 0:
                    System.exit(0);
                case 1:
                    User a = new User();
                    Person b = new Person();
                    p("لطفاشماره موبایل خودرا واردنمایید:");
                    a.setMobileNumber(input.next());
                    if (getUserIndexByMobile(a.getMobileNumber()) != null) {
                        p("شماره موبایل قبلا درسیستم ثبت شده است!!");
                        break;
                    }
                    p("نام خودراوارد نمایید:");
                    b.setName(input.next());
                    p("نام خانوادگی خودراوارد نمایید:");
                    b.setLastName(input.next());
                    p("رمزعبورخودرا واردنمایید:");
                    a.setPassword(input.next());
                    p("ایمیل خودرا واردنمایید:");
                    a.setEmail(input.next());
                    a.setPerson(b);
                    users[index] = a;
                    index++;
                    p("اطلاعات شمابا موفقیت در سیستم ثبت شد");
                    break;

                case 2:
                    System.out.println("برای ورودبه سیستم شماره موبایل خودرا واردنمایید:");
                    userIndex = getUserIndexByMobile(input.next());
                    if (userIndex != null && userIndex >= 0) {
                        User currentUser = users[userIndex];
                        p("رمزعبورخودرا واردنمایید:");
                        String password = input.next();
                        if (currentUser.getPassword().equals(password)) {
                            p("باموفقیت واردشدید");
                            p(currentUser.getPerson().getName() + " عزیز خوش آمدید");
                        } else p(";کاربریافت نشد!!");
                    }
                    break;
            }
        }
    }
    private static void p(String message){
        System.out.println(message);
    }

    private static Integer getUserIndexByMobile(String Mobile){
        for (Integer i = 0; i < users.length; i++){
            if (users[i] != null &&
                    users[i].getMobileNumber() != null &&
                    users[i].getMobileNumber().equals(Mobile)){
                return i;
            }
        }
        return null;
    }
}
