import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainApp {
  public static Employee[] employees = new Employee[100];
  public static Integer index = 0;
    public static void main(String[] args) {    try {
        while (true){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            Integer karmandIndex;
            System.out.println("منو");
            System.out.println("لطفا گزینه موردنظررا انتخاب نمایید:");
            System.out.println("1: ثبت مرخصی جدید");
            System.out.println("2: نمایش مرخصی ها");
            System.out.println("0: خروج");
                Integer menu = Integer.parseInt(reader.readLine());
                switch (menu){
                    case 0: System.exit(0);
                    case 1:
                        Employee a = new Employee();
                        System.out.println("لطفا کدکارمندی خودرا واردنمایید:");
                        a.setEmployeeCode(reader.readLine());
                        Integer oldIndex = getemployIndexByCode(a.getEmployeeCode());
                        if (oldIndex != null && oldIndex >= 0){
                            a = employees[oldIndex];
                            getVacation(a, reader);
                            employees[oldIndex] = a;
                            break;
                        }
                        System.out.println("لطفا نام خودرا واردنمایید:");
                        a.setName(reader.readLine());
                        System.out.println("لطفا نام خانوادگی خودرا واردنمایید:");
                        a.setLastName(reader.readLine());
                        getVacation(a, reader);
                        employees[index] = a;
                        index++;
                        break;

                    case 2:
                        System.out.println("جهت مشاهده لیست مرخصی ها کدکارمندی خودرا واردنمایید:");
                        karmandIndex = getemployIndexByCode(reader.readLine());
                        if (karmandIndex != null && karmandIndex >= 0){
                            Employee currentKarmand = employees[karmandIndex];
                            for (Integer i =0; i < currentKarmand.getVacations().length; i++){
                                Vacation currentVacation = currentKarmand.getVacations()[i];
                                if (currentVacation != null){
                                    System.out.println(currentVacation.getDateVacation() + " " + currentVacation.getTimeVacation());
                                }
                            }
                        }else {
                            System.out.println("مرخصی یافت نشد!!!");
                        }

                }
            }
    }catch (IOException e) {
                throw new RuntimeException(e);
            }
    }

    private static void getVacation(Employee a, BufferedReader reader) throws IOException {
        Vacation b = new Vacation();
        System.out.println("تاريخ مرخصی خودرا واردنمایید:");
        b.setDateVacation(reader.readLine());
        System.out.println("ساعت مرخصی خودرا واردنمایید:");
        b.setTimeVacation(reader.readLine());
        a.addVacation(b);
    }

    private static Integer getemployIndexByCode(String code){
        for (Integer i = 0; i < employees.length; i++){
            if (employees[i] != null &&
                    employees[i].getEmployeeCode() != null &&
                    employees[i].getEmployeeCode().equals(code)){
                return i;
            }
        }
        return null;
    }
}
