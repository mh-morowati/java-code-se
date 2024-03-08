import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Mainapp {
    public static void main(String[] args) throws IOException {
        /*while (true){
      String myInput = getinput();
      if(myInput.equals("0")) break;
        System.out.println(myInput);}*/

        /*for (int i = 0;i<50;i++){
            System.out.println(getRandomNumber(5000,String.valueOf(i)));*/
  //  }
       /* System.out.println("Please enter count : ");
        Integer myInput = getInputNumber();
        Integer sum = getSumofNumbers(myInput);
        System.out.println("sum : " + sum);*/

        /*System.out.println(sumOfStrings("hossein","badrnezhad","java developer","android","and teacher programming"));

        System.out.println(sumnumber(10,20,30,40,50,60,70,80,90));*/

        System.out.println(sum(10));

    }


    private static Integer sum(int max){
        if (max > 0)
        return max + sum(max - 1) + sum(max - 2);
        else
            return 0;

    }

    private static String sumOfStrings(String... strings){
        StringBuilder xxx = new StringBuilder();
        for (String str : strings) {
            xxx.append(str).append(" ");
        }
        return xxx.toString();
    }

   private static int sumnumber(int... numbers){
        int total = 0;
        for (int number : numbers){
            total += number;
        }
        return total;
   }
    private static Integer getSumofNumbers(Integer myInput) throws IOException {
        Integer sum = 0;
        for (int i = 0; i < myInput; i++) {
            System.out.println("Please enter your number : ");
            Integer myValue = getInputNumber();
            sum += myValue;
        }
        return sum;
    }

    private static String getinput() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String myValue = reader.readLine();
        return myValue;
    }

    private static Integer getInputNumber() throws IOException {
        return Integer.parseInt(getinput());
    }

    protected static Integer getRandomNumber(int bound, String name) {
        Random rand = new Random();
        System.out.println(name);
        int n = rand.nextInt(bound);
        return n;
    }
}
