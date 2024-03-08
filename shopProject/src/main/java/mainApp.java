import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class mainApp {
    public static void main(String[] args) {
        try {

            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                System.out.println("______________________");
                System.out.println("آمار فروشندگان بوتیک");
                System.out.println("تعدادفروشندگان راوارد نمایید: (یابرای خروج عدد0راواردکنید)");
                Integer sellersNum = Integer.valueOf(input.readLine());
                if(sellersNum.equals(0)) {
                    System.out.println("خدانگهدار");
                    break;
                }
                double bestSellerSumPrice = 0;
                double shopSumprice = 0;
                String bestSellerName = "";
                for (Integer num = 0; num < sellersNum; num++) {
                    System.out.println("نام فروشنده را واردنمایید:");
                    String sellerName = input.readLine();
                    System.out.println("تعدادفاکتورهای فروشنده راواردنمایید:");
                    Integer invoiceCount = Integer.valueOf(input.readLine());
                    double sumPrice = 0;
                    for (Integer num2 = 0; num2 < invoiceCount; num2++) {
                        System.out.println("مبلغ هرفاکتوررا واردنمایید:");
                        Long invoicePrice = Long.valueOf(input.readLine());
                        sumPrice += invoicePrice;
                    }
                    shopSumprice += sumPrice;
                    if (sumPrice > bestSellerSumPrice) {
                        bestSellerSumPrice = sumPrice;
                        bestSellerName = sellerName;
                    }
                   double averagePrice = sumPrice / invoiceCount;
                    System.out.printf("جمع فروش " + sellerName + " " + sumPrice + "تومان است");
                    System.out.printf(" میانگین فروش امروز " + sellerName +" " + averagePrice + " تومان است ");
                    if(sumPrice <= 5000000.0) System.out.println(sellerName + " جزء فروشندگان ضعیف است");
                    else if (sumPrice > 5000000.0 && sumPrice <= 10000000.0) {
                        System.out.println(sellerName + " جزء فروشندگان متوسط است");
                    } else if (sumPrice > 10000000.0) {
                        System.out.println(sellerName + " جزء فروشندگان برتراست");
                    }

                    // System.out.println("مشخصات فروشنده nام ثبت شد وتعداد....باقیمانده است ");
                    System.out.println("مشخصات فروشنده" + (num + 1) + " ثبت شد و" + (sellersNum - (num + 1)) + "فروشنده باقیمانده است");
                }
                System.out.println("بهترین فروشنده شما: " + bestSellerName + " است");
                System.out.println("میزان فروش بهترین فروشنده: " + " " + bestSellerSumPrice + " تومان است");
                System.out.println(" میزان فروش کل امروز فروشگاه: " + " " + shopSumprice + " تومان است");
            }
            } catch(IOException e){
            System.out.println("لطفامقداردرست واردنمایید!!!!");
        } catch(NumberFormatException e){
            System.out.println("لطفاعدد درست واردنمایید!!!!!!");
        } catch(Exception e){
            System.out.println("خطا!!!!");
        }
        }
    }
