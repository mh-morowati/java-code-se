import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MainApp {
    static List<Product> productList = new ArrayList<>();
    static List<Order> orderList = new ArrayList<>();

    public static void main(String[] args) {
        try {
            while (true) {
                showMenu();
                getMenu();
            }


        } catch (IOException e) {
            p("please enter valid input!!!");
        } catch (NumberFormatException e) {
            p("Please enter correct number!!!");
        } catch (Exception e) {
            p("Error!!!");
        }
    }

    private static void showMenu() {
        p("MENU");
        p("0- exit");
        p("1- add Product");
        p("2- add order");
        p("3- show order list & change status");
        p("4- show product");
    }

    private static void getMenu() throws Exception {
        int menu = Integer.parseInt(getInput());
        switch (menu) {
            case 1:
                addProduct();
                break;
            case 2:
                addOrder();
                break;
            case 3:
                showChangeStatus();
                break;
            case 4:
                for (Product product : productList){
                    p(product.toString());
                }
                break;
            case 0:
                System.exit(0);
        }
    }

    private static void showChangeStatus() throws IOException {
        for (Order order : orderList){
            p(order.toString());
        }
        p("enter order id:");
        String id = getInput();
        for (Order order : orderList){
            if (order.getId().equals(id)){
                p("enter status:");
                p("1- inProduction,\n" +
                        "2- produced");
                order.setStatus(Integer.parseInt(getInput()));
                p("Status changed to : " + order.getStatus());
            }
        }
    }

    private static void addOrder() throws Exception {
        p("enter the code product:");
        String code = getInput();
        Product product = null;
        for (Product item : productList) {
            if (item.getCode().equalsIgnoreCase(code)) {
                product = item;
                break;
            }
        }
        if (product == null)
            throw new Exception("product not found!!!");
        Order order = new Order();
        order.setProduct(product);
        order.setType(product.getType());
        order.setStatus(Status.duringProduction);
        p("enter count:");
        order.setCount(Integer.parseInt(getInput()));
        p("enter release day:");
        order.setDate(getInput());
        order.setId(String.valueOf(orderList.size() + 1));
        orderList.add(order);
        p("order added successfully");
    }

    private static void addProduct() throws IOException {
        Product product;
        p("pick Car type");
        p("""
                1: pickupTruck,
                2: Luxury,
                3: Riding,
                4: LuxuryElec,
                5: RidingElec,""");
        int type = Integer.parseInt(getInput());
        switch (type){
            case 1:
            case 2:
            case 3:
                product =new Gasoline();
                p("The car is gasoline");
                p("enter the tank capacity");
                ((Gasoline) product).setTankCapacity(getInput());
                break;
            case 4:
            case 5:
                product = new Electric();
                p("The car is electric");
                p("enter the battery capacity");
                ((Electric) product).setBatteryCapacity(getInput());
                break;
            default:
                throw new IllegalStateException("Unxpected valu:" + type);}
        product.setType(type);
        p("Enter car name:");
        product.setName(getInput());
        p("Enter product code:");
        product.setCode(getInput());
        p("Enter car Price:");
        product.setPrice(getInput());
        p("Enter Company address");
        product.setAddress(getInput());
        productList.add(product);

        p("product added successfully");
    }

    private static void p(String msg) {
        System.out.println(msg);
    }

    private static String getInput() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        return reader.readLine();
    }
}
