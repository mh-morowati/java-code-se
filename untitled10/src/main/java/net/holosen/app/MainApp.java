package net.holosen.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class MainApp {
    private static employ[] employees = new employ[100];
    private static Integer index = 0;
    public static void main(String[] args) {
        while (true){
            System.out.println("لطفاگزینه موردنظرخودرا واردنمایید:");
            System.out.println("1: ثبت مرخصی");
            System.out.println("2: استعلام مرخصی");
            System.out.println("0: خروج");
            Scanner input = new Scanner(System.in);
            Integer menu = input.nextInt();
            Integer karmandIndex;
            switch (menu){
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("کدکارمندی خودرا واردنمایید:");
                    employ karmand = new employ();
                    karmand.setEmployCode(input.next());
                    Integer oldIndex = getemployIndexByCode(karmand.getEmployCode());
                    if (oldIndex != null && oldIndex >= 0){
                        karmand = employees[oldIndex];
                        getVacation(input, karmand);
                        employees[oldIndex] = karmand;
                    }else {
                        System.out.println("نام خودراواردنمایید:");
                        karmand.setNama(input.next());
                        System.out.println("نام خانوادگی خودراواردنمایید:");
                        karmand.setFamilyName(input.next());
                        getVacation(input, karmand);
                        employees[index] = karmand;
                       // karmandIndex = index;
                        index++;
                    }
                    System.out.println("مرخصی شمابا موفقیت ثبت شد");
                    break;

                case 2:
                    System.out.println("جهت مشاهده لیست مرخصی ها کدکارمندی خودرا واردنمایید:");
                    karmandIndex = getemployIndexByCode(input.next());
                    if (karmandIndex != null && karmandIndex >= 0){
                        employ currentKarmand = employees[karmandIndex];
                        for (Integer i =0; i < currentKarmand.getVacations().length; i++){
                           vacation currentVacation = currentKarmand.getVacations()[i];
                            if (currentVacation != null){
                                System.out.println(currentVacation.getVacationDate() + " " + currentVacation.getVacationTime());
                            }
                        }
                    }else {
                        System.out.println("مرخصی یافت نشد!!!");
                    }
            }
        }
    }
    private static void getVacation(Scanner input, employ karmand){
        System.out.println("تاریخ مرخصی خودرا واردنمایید:");
        vacation v = new vacation();
        v.setVacationDate(input.next());
        System.out.println("ساعت مرخصی خودرا واردنمایید:");
        v.setVacationTime(input.next());
        karmand.addVacation(v);
    }
    private static Integer getemployIndexByCode(String code){
        for (Integer i = 0; i < employees.length; i++){
            if (employees[i] != null &&
            employees[i].getEmployCode() != null &&
            employees[i].getEmployCode().equals(code)){
                return i;
            }
        }
        return null;
    }
}
