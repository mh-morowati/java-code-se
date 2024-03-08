import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mainapp {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        /*System.out.println("عدد موردنظررا وارد کنید:");
        Integer num =Integer.valueOf(reader.readLine());
        System.out.println(sum(num));*/

        /*Integer num2 =Integer.valueOf(reader.readLine());
        System.out.println(fibonacci(num2));*/

        Integer num3 =Integer.valueOf(reader.readLine());
        System.out.println(mul(num3));

    }

    private static Integer sum(int max){
        if (max > 0)
        return max + sum(max - 1);
        else
            return 0;

    }


    public static int fibonacci(int n){
        if (n < 2) return n;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    private static long mul(int n){
        if (n == 1)
            return 1;
            return n * mul(n - 1);

    }
}
