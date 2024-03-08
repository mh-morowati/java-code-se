package net.holosen.app.models;

import net.holosen.app.enums.Status;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MainApp {
    static List<Product> productList;
    static List<Order> orderList;

    static {
        productList = new ArrayList<>();
        orderList = new ArrayList<>();
    }

    public static void main(String[] args) {
        while (true) {
            showMenu();
            try {
                getMenu();
            } catch (IOException e) {
                p("enter valid input!!!");
            } catch (NumberFormatException e) {
                p("enter correct number!!!");
            } catch (Exception e) {
                p("wrong!!!");
            }
        }
    }

    private static void getMenu() throws Exception {
int menu = Integer.parseInt(getInput());
switch (menu){
    case 1:
        addProduct();
        break;
    case 2:
        addOrder();
        break;
    case 3:
        showOrder();
        changeStatus();
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

    private static void addProduct() throws IOException {
        Product product;
        System.out.println("enter product type");
        p("""
                 1: cannedFood,
                 2: washer,
                 3: dairy,
                 4: snacks,
                 5: Proteins,
                 6: Beverages,
                 7: Coffee\
                """);
        Integer type = Integer.parseInt(getInput());
        switch (type){
            case 1:
            case 2:
            case 4:
            case 6:
            case 7:
                product = new InCorruptible();
                p("The product is non-perishable");
                p("enter The longest storage day in the warehouse:");
                ((InCorruptible) product).setMaintainMaxDay(getInput());
                break;
            case 3:
            case 5:
                product = new CorruptibleProduct();
                p("The product is perishable");
                p("enter Maximum temperature for storage:");
                ((CorruptibleProduct) product).setMaxTemp(getInput());
                p("enter Minimum temperature for storage:");
                ((CorruptibleProduct) product).setMinTemp(getInput());
                break;
            default: throw new IllegalStateException("The amount is not available" + type);

        }
        product.setType(type);
        p("enter product name:");
        product.setName(getInput());
        p("enter product code:");
        product.setCode(getInput());
        p("enter product price:");
        product.setPrice(getInput());
        p("enter product maintain:");
        product.setMaintain(getInput());
        p("enter company address:");
        product.setAddress(getInput());
        productList.add(product);
        p("product added successfully");
    }

    private static void addOrder() throws Exception {
p("enter product code:");
String code = getInput();
Product product =null;
for (Product item : productList){
    if(item.getCode().equalsIgnoreCase(code)){
        product = item;
        break;
    }
}
if (product == null){
    throw new Exception("product not found!!");
}
Order order = new Order();
order.setProduct(product);
order.setType(product.getType());
order.setStatus(Status.duringProduction);
p("enter order count:");
order.setCount(Long.parseLong(getInput()));
p("enter Order delivery date");
order.setDate(getInput());
order.setId(String.valueOf(productList.size() + 1));
orderList.add(order);
p("order added successfully");
    }

    private static void showOrder() {
for (Order order : orderList){
   p(order.toString());
}
    }

    private static void changeStatus() throws IOException {
        p("enter order id:");
        String id = getInput();
        for (Order order: orderList){
            if (order.getId().equals(id)){
                p("choice status:");
                p("1: inProduction");
                p("2:  produced");
                order.setStatus(Integer.parseInt(getInput()));
            }
        }
    }

    private static void showMenu() {
        p("choose Menu");
        p("1: add product");
        p("2: add order");
        p("3: change status");
        p("4: show product");
        p("0: exit");
    }

    private static String getInput() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }

    private static void p(String msg) {
        System.out.println(msg);
    }
}
