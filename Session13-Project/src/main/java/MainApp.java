import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainApp {
    private static final Person[] users = new Person[100];
    private static Integer index = 0;

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                System.out.println("لطفاگزینه موردنظررا انتخاب کنید:");
                System.out.println("1: ثبت نام");
                System.out.println("2: ورود");
                System.out.println("0: خروج");
                int menu = Integer.parseInt(reader.readLine());
                Integer userIndex;
                switch (menu) {

                    case 0:
                        System.exit(0);

                    case 1:
                        User input = new User();
                        Person a = new Person();
                        System.out.println("لطفاشماره موبایل خودراواردنمایید:");
                        a.setMobileNumber(reader.readLine());
                        if (getUserIndexByMobile(a.getMobileNumber()) != null){
                            System.out.println("بااین شماره قبلا ثبت نام کرده اید. لطفا واردشوید");
                            break;
                        }
                        System.out.println("لطفانام خودرا واردنمایید:");
                        input.setName(reader.readLine());
                        System.out.println("لطفانام خانوادگی خودرا واردنمایید:");
                        input.setLastName(reader.readLine());
                        System.out.println("رمزعبورخودرا واردنمایید:");
                        a.setPassword(reader.readLine());
                        System.out.println("ایمیل خودرا واردنمایید:");
                        a.setEmail(reader.readLine());
                        a.setUser(input);
                        users[index] = a;
                        index++;
                        System.out.println("ثبت نام شمابا موفقیت انجام شد");

                        break;

                    case 2:
                        System.out.println("نام کاربری خودرا واردنمایید(شماره موبایل):");
                        userIndex = getUserIndexByMobile(reader.readLine());
                        if (userIndex != null && userIndex >= 0){
                            Person currentPerson = users[userIndex];
                            System.out.println("رمزعبورخودرا واردنمایید:");
                            String myPassword = reader.readLine();
                            if (currentPerson.getPassword().equals(myPassword)){
                                System.out.println("باموفقیت واردشدید");
                                System.out.println(currentPerson.getUser().getName() + " عزیز خوش آمدید");
                                while (true) {
                                    System.out.println("لطفا انتخاب کنید:");
                                    System.out.println("1: نمایش اطلاعات کاربری   2: تغییررمز ورود 0:خروج کاربر");
                                    int meno = Integer.parseInt(reader.readLine());
                                    if (meno == 0) break;
                                    switch (meno) {
                                        case 1:
                                            System.out.println(currentPerson.toString());
                                            break;
                                        case 2:
                                            System.out.println("رمز عبور جدید خودرا وارد نمایید:");
                                            currentPerson.setPassword(reader.readLine());
                                            System.out.println("رمزعبور باموفقیت تغییریافت");
                                            break;
                                    }
                                }
                            }
                        }
                        else {
                            System.out.println("نام کاربری یافت نشد");
                        }

                        break;
                }
            }
        } catch (IOException e) {
            System.out.println("wrong!!!");
        }
    }
        private static Integer getUserIndexByMobile(String mobile){
            for (int i = 0; i < users.length; i++){
                if (users[i] != null &&
                        users[i].getMobileNumber() != null &&
                        users[i].getMobileNumber().equals(mobile)){
                    return i;
                }
            }
            return null;
        }
}
