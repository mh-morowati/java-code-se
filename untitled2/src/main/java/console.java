import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class console {
    public static void main(String[] args) {
        try {
            System.out.println("Please enter your job : ");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String myJob = reader.readLine();
            System.out.println("Ok : " + myJob);
            System.out.println("Please enter your income");
            Integer myIncome = Integer.valueOf(reader.readLine());
            System.out.println("your income is : " + myIncome);
        } catch (NumberFormatException e) {
            System.out.println(" NumberFormatException : Please enter a valid input");
        } catch (IOException e) {
            System.out.println("IOException : Please enter a valid input");
        } catch (Exception e) {
            System.out.println("Exception???");
        }
    }
}