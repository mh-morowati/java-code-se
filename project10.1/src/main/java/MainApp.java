import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        try {

            while (true) {
                Scanner input = getScanner();
                System.out.println("برای خروج عدد0 راواردنمایید!");
                System.out.println("برای بازی دوباره عددی دیگر");
                Integer out = Integer.valueOf(input.nextInt());
                if (out == 0) System.exit(0);

            }
        } catch (IOException e) {
            System.out.println("خطادر ورودی!!");
    } catch (NumberFormatException e) {
            System.out.println("لطفا عدد درست وارد نمایید!!!");
    } catch (Exception e) {
            System.out.println("خطا!!!!");
    }}

    private static Scanner getScanner() throws IOException {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        Integer health = 5;
        System.out.println("لطفا بازه عددی را مشخص کن: ");
Integer c = Integer.parseInt(input.next());
        //int t = 10 + c;
        int l = 5;
        Integer myNumber = rand.nextInt(1 + c);
       // System.out.println(myNumber);
        System.out.println("عددی بین " + 0 + "..." + c + "واردکن:");
        for (int i = 0;i< health;i++){
        Integer gussNumber = Integer.parseInt(input.next());
        if (gussNumber == myNumber){
            System.out.println("درست گفتیا");
            health = 0;
            getScanner();
        } else if (gussNumber < myNumber) {
            System.out.println("بروبالا");
            l--;
        }
        else if (gussNumber > myNumber){
            System.out.println("بیاپایین");
            l--;
           }
        if (l == 0)
            System.out.println("باختی!!!");
        }
        return input;
    }
}