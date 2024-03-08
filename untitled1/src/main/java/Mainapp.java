
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.NumberFormat;

public class Mainapp {
    public static void main(String[] args) {
        try {

        System.out.println("Please enter your name : ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String myName = null;
            myName = reader.readLine();
        System.out.println("Hello" + myName);
        System.out.println("Please enter your age");
        Integer myAge = Integer.valueOf(reader.readLine());
        System.out.println("Your age is : " + myAge);
        Float aFloat =Float.valueOf("1.4");
        Double aDouble = Double.valueOf("19999.66");
        String s = String.valueOf(1234567);
        Short aShort =Short.valueOf("123");
        float myFloatNumber =1.33566f;
    } catch (NumberFormatException e) {
            System.out.println(" NumberFormatException : Please enter a valid input");
    } catch (IOException e) {
            System.out.println("IOException : Please enter a valid input");
            }
        catch (Exception e){
            System.out.println("Exception???");

        }
        }


    }
