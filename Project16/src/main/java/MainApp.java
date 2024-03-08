import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static List<Order> orderList;
    public static List<Product> productList;
static {
    orderList = new ArrayList<>();
 productList = new ArrayList<>();
}

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
           while (true) {
               showMenu();
               int menu = Integer.parseInt(reader.readLine());
               switch (menu) {
                   case 0:
                       System.exit(0);
                   case 1:
                       addProduct(reader);
                       break;

                   case 2:
                       addOrder(reader);

                       break;

                   case 3:
                       showOrderList();
                       changeStatus();
                       break;

                   case 4:
                       for (Product product : productList){
                           p(product.toString());
                       }
                       break;

               }
           }
        } catch (NumberFormatException e) {
            System.out.println("لطفا عدددرست را واردنمایید!!!");
        }  catch (IOException e) {
            System.out.println("خطا درورودی!!!");
        } catch (Exception e) {
            System.out.println("خطا!!!");
        }

    }

    private static void changeStatus() throws IOException {
        p("لطفا شماره سفارش را واردنمایید: ");
        String id = getInput();
        for (Order order : orderList){
            if (order.getId().equals(id)){
                p("لطفاوضعیت سفارش راانتخاب کنید:");
                p("1: درحال تولید   2: تولیدشده");
                order.setStatus(Integer.parseInt(getInput()));
                p("وضعیت سفارش به: " + order.getStatus() + " تغییرکرد.");
            }
        }
    }

    private static void showOrderList() {
        for (Order order : orderList){
            p(order.toString());
        }
    }

    private static void addOrder(BufferedReader reader) throws Exception {
        p("کدمحصول راواردنمایید:");
        String code = reader.readLine();
        Product product = null;
        for (Product item : productList){
            if (item.getCode().equalsIgnoreCase(code)){
                product = item;
                break;
            }
        }
        if (product == null){
           throw new Exception("پیدانشد");
        }
        Order order = new Order();
        order.setProduct(product);
        order.setType(product.getType());
        order.setStatus(Status.duringProduction);
        System.out.println("تعدادمحصول راواردنمایید:");
        order.setCount(Long.valueOf(reader.readLine()));
        System.out.println("تاریخ تحویل سفارش راواردنمایید:");
        order.setDate(reader.readLine());
        order.setId(String.valueOf(orderList.size() + 1));
        orderList.add(order);
        p("سفارش باموفقیت اضافه شد");
    }

    private static void showMenu() {
        System.out.println("منو");
        System.out.println("0- خروج");
        System.out.println("1- افزودن تولید");
        System.out.println("2-تیم فروش: اضافه کردن سفارش ");
        System.out.println("3- تیم فنی و انبار: نمایش سفارشها و تغییر");
        p("4- نمایش جزییات تولید");
    }

    private static void addProduct(BufferedReader reader) throws IOException {
        Product product;
        System.out.println("نوع محصول را انتخاب کنید:");
        System.out.println("1:شوینده  2:لبنیات  3:پروتیینی  4:تنقلات 5:کنسرو 6: نوشیدنی 7:قهوه و متعلقات");
        Integer type = Integer.parseInt(reader.readLine());
        switch (type) {
            case 1:

            case 4:

            case 5:

            case 6:

            case 7:
                product = new InCorruptible();
                System.out.println("محصول فاسدنشدنی است");
                System.out.println("حداکثرزمان نگه داری درانبار راوارد نمایید:");
                ((InCorruptible) product).setMaintainMaxDay(getInput());
                break;

            case 2:

            case 3:
                product = new CorruptibleProduct();
                System.out.println("محصول فاسدشدنی است");
                System.out.println("حداقل دمابرای نگه داری را واردنمایید: ");
                ((CorruptibleProduct) product).setMinTemp(getInput());
                System.out.println("حداکثر دمابرای نگه داری را واردنمایید: ");
                ((CorruptibleProduct) product).setMaxTemp(getInput());
                break;
            default:
                throw new IllegalStateException("مقدارموجودنیست: " + type);
        }
        product.setType(type);
        System.out.println("نام محصول راواردنمایید:");
        product.setName(reader.readLine());
        System.out.println("شماره فنی کالارا واردنمایید:");
        product.setCode(reader.readLine());
        System.out.println("قیمت محصول را واردنمایید:");
        product.setPrice(reader.readLine());
        System.out.println("شرایط نگهداری رابنویسید:");
        product.setMaintain(reader.readLine());
        System.out.println("آدرس کارخانه راواردنمایید:");
        product.setAddress(reader.readLine());
        productList.add(product);
        p("محصول باموفقیت ثبت شد");
    }
    private static void p(String msg){
        System.out.println(msg);
    }
    private static String getInput() throws IOException {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        return reader.readLine();
    }
}
