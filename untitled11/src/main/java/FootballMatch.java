import java.util.Scanner;

public class FootballMatch {
    enum whoWins{
       پرسپولیس , استقلال , مساوی
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      System.out.println("لطفاتعداد گلهای پرسپولیس را واردنمایید:");
        int persGoal = input.nextInt();
        System.out.println("لطفاتعداد گلهای استقلال را واردنمایید:");
        int estGoal = input.nextInt();
        if(persGoal > estGoal){
            System.out.println(whoWins.پرسپولیس + " برنده است");
        }
        else if(estGoal > persGoal){
            System.out.println(whoWins.استقلال + " برنده است");
        }
        else {
            System.out.println(whoWins.مساوی);
        }
    }
}
