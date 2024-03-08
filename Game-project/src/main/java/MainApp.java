import java.util.Random;
import java.util.Scanner;

public class MainApp {
    static int c = 10;

    public static void main(String[] args) {
        try {
            while (true) {
                Random rand = new Random();
                int myNumber = rand.nextInt(c);
                int health = 5;
                boolean win = false;
                System.out.println("عددتوبین 0 تا" + c + " انتخاب کن");

                while (health > 0 && !win) {
                    int gussNumber = Integer.parseInt(getInput());
                    if (gussNumber == myNumber) {
                        System.out.println("درست گفتیا");
                        win = true;
                        c = c + 3;
                    } else if (gussNumber < myNumber) {
                        System.out.println("بروبالاتر");
                        health--;
                    } else {
                        System.out.println("بیاپایین");
                        health--;
                    }
                }
                if (!win) {
                    System.out.println("شماباختید!!!");
                    c = 10;
                    checkAndClose();
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("لطفا عدد وارد نمایید!!!!");
        }
    }

    private static boolean checkAndClose() {
        System.out.println("برای خروج عدد 0 ودرغیراینصورت عددی دیگر بزنید");
        int menu = Integer.parseInt(getInput());
        if (menu == 0){
            System.exit(0);
            return false;
        }
        return true;
    }
    private static String getInput(){
        Scanner input = new Scanner(System.in);
        return input.next();
    }
}
