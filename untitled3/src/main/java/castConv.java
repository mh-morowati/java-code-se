import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class castConv {
    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) { try {
            System.out.println("نام خودرا وارد نمایید:");
            String name = reader.readLine();
            if(name.equals("0")) break;
            System.out.println("تعداد کتابهای انتخابی راوارد نمایید:");
            Integer numberBook = Integer.valueOf(reader.readLine());
            Long totalPrice = 0L;
            for (int i = 0; i < numberBook; i++) {
                System.out.println(" نام کتاب راوارد نمایید");
                String bookName = reader.readLine();
                System.out.println("قیمت کتاب راوارد نمایید");
                Integer priceBook = Integer.valueOf(reader.readLine());
                totalPrice += priceBook;
            }
            System.out.println(name + " عزیز" + "قیمت کتابهای شما" + totalPrice);

        } catch(IOException e){
            throw new RuntimeException(e);
        }
    }
    }


    }
