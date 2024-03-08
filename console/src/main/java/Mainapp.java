import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.NumberFormat;

public class Mainapp {
    public static void main(String[] args)  {         try {
        System.out.println("Please enter your job : ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String myJob = reader.readLine();
        System.out.println("Your job is : " + myJob);
        System.out.println("Please enter your income :");
        Integer myIncome = Integer.valueOf(reader.readLine());
        System.out.println("your income is : " + myIncome);
        System.out.println("enter your work years : ");
        Float workYear= Float.valueOf(reader.readLine());
        System.out.println("your work years is : " + workYear);
        } catch (IOException e) {
        System.out.println("your valid is wrong Please try again");
    } catch(NumberFormatException ex){
        System.out.println("wrong try again");
    } catch(Exception ex){
        System.out.println("exception");


    }



    }

    }

