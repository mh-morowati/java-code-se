import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mainapp {
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter your name:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String myInput = reader.readLine();
        System.out.println("Your Input is : " + myInput);
    }
}
