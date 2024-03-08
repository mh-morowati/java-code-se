package net.holosen.app;

import net.holosen.app.util.SecurityUtil;
import net.holosen.app.util.Utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        try {
            while (true) {
                showMenu();
                int menu = Integer.parseInt(getInput());
                switch (menu) {
                    case 1:
                        addInvoice();
                        break;
                    case 2:
                        System.out.println("نام کاربری را واردنمایید:");
                        String userName = getInput();
                        System.out.println("رمزعبور را واردنمایید:");
                        String password = getInput();
                        if (!checkAndPassword(userName, password)) {
                            System.out.println("دسترسی رد شد");
                            break;
                        }
                        while (true) {
                            showAdminMenu();
                            int adminMenu = Integer.parseInt(getInput());
                            if (adminMenu == 0) break;
                            switch (adminMenu) {
                                case 1:
                                    LocalDate myDate = LocalDate.now();
                                    String fileName = String.valueOf(myDate).replaceAll("-", "") + ".txt";
                                    File f = new File(fileName);
                                    boolean exist = f.exists();
                                    if (!exist) {
                                        System.out.println("فاکتوری یافت نشد!!!");
                                        break;
                                    }
                                    showInvoiceByDate(fileName);
                                    break;
                                case 2:
                                    System.out.println("تاریخ را واردنمایید:(سال-ماه-روز)");
                                    String customDate = getInput().replaceAll("-", "") + ".txt";
                                    File f2 = new File(customDate);
                                    boolean exist2 = f2.exists();
                                    if (!exist2) {
                                        System.out.println("فاکتوری یافت نشد!!!");
                                        break;
                                    }
                                    showInvoiceByDate(customDate);
                                    break;
                            }
                        }
                        break;
                    case 0:
                        System.exit(0);
                }
            }

        } catch (IOException e) {
            System.out.println("لطفامقدار درست واردکنید!!!");
        } catch (NumberFormatException e) {
            System.out.println("لطفاعدد واردکنید!!!");
        } catch (Exception e) {
            System.out.println("خطا!!!");
        }
    }

    private static void showInvoiceByDate(String fileName) throws IOException {
        Utils util = new Utils();
        List<String> file = util.readerFile(fileName);
        List<Invoice> invoices = new ArrayList<>();
        for (String str : file) {
            invoices.add(new Invoice().deserialize(str));
        }
        Long totalPrice = 0L;
        int count = invoices.size();
        for (Invoice invoice : invoices) {
            System.out.println(invoice.toString());
            totalPrice += invoice.getTotalPrice();
        }
        System.out.println("Count: " + count);
        System.out.println("Total price: " + totalPrice + " تومان");
    }

    private static void showAdminMenu() {
        System.out.println("1: لیست فاکتورهای امروز");
        System.out.println("2: کل فاکتورها");
        System.out.println("0: خروج");
    }


    private static boolean checkAndPassword(String userName, String password) throws IOException {
        String fileName = "secure.file";
        Utils util = new Utils();
        String file = util.readerFile(fileName).getFirst();
        String[] split = file.split(":");
        String user = split[0];
        String pass = split[1];
        userName = SecurityUtil.hashMD5(userName);
        password = SecurityUtil.hashMD5(password);
        return (user.equals(userName) && pass.equals(password));
    }

    private static void addInvoice() throws IOException {
        Invoice invoice = new Invoice();
        System.out.println("نام ونام خانوادگی راننده راواردنمایید:");
        invoice.setName(getInput());
        System.out.println("نوع محصول راواردنمایید:");
        invoice.setProductName(getInput());
        System.out.println("وزن بار را به کیلوگرم واردنمایید:");
        invoice.setWeight(Integer.parseInt(getInput()));
        System.out.println("قیمت محصول راواردنمایید:");
        invoice.setPrice(Long.parseLong(getInput()));
        Long totalprice = invoice.getWeight() * invoice.getPrice();
        invoice.setTotalPrice(totalprice);
        LocalDate myDate = LocalDate.now();
        invoice.setDate(String.valueOf(myDate));
        LocalTime myTime = LocalTime.now();
        invoice.setTime(String.valueOf(myTime));
        System.out.println(invoice.getDate() + " " + invoice.getTime());
        System.out.println(" " + invoice.getName());
        System.out.println(" " + invoice.getProductName());
        System.out.println(" " + invoice.getWeight() + "کیلوگرم");
        System.out.println(" " + invoice.getPrice() + "تومان");
        System.out.println(" " + invoice.getTotalPrice() + "تومان");
        appendFile(invoice);
    }

    private static void appendFile(Invoice invoice) throws IOException {
        String invoiceStr = invoice.serialize() + "\n";
        String fileName = invoice.getDate().replaceAll("-", "") + ".txt";
        Utils util = new Utils();
        util.appendFile(fileName, invoiceStr);
    }

    private static void showMenu() {
        System.out.println("انتخاب کنید");
        System.out.println("1: افزودن فاکتور");
        System.out.println("2: نمایش فاکتورها");
        System.out.println("0: خروج");
    }

    private static String getInput() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        return reader.readLine();
    }
}
