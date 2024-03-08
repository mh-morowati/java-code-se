public class MainApp {
    public static void main(String[] args) {
        Test<Integer> iObj = new Test<>(15);
        System.out.println(iObj.getObject());
        Test<String> sObj = new Test<>("geek is gkljj");
        System.out.println(sObj.getObject());
    }
}
