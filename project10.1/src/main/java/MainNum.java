import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class MainNum {
    public static void main(String[] args) {
        extractedGame();
    }

    private static void extractedGame() {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        Integer health = 5;

        Integer c = 0;
        int t = 10 + c;
        Integer myNumber = rand.nextInt(11 + c);
        System.out.println("عددی بین " + 0 + "..." + t + "واردکن:");
        System.out.println(myNumber);
        while (health > 0) {

            Integer guessNumber = input.nextInt();
            if (guessNumber.equals(myNumber)) {
                System.out.println("درست گفتیا");
                c += 10;
            } else if (guessNumber < myNumber) {
                System.out.println("بروبالاتر");
                health--;
            } else if (guessNumber > myNumber) {
                System.out.println("بیاپایین");
                health--;
            }

        }
        if (health == 0);
        System.out.println("باختی!!!");
        extractedGame();
    }
}





