package Test;

public class MainApp2 {
    public static void main(String[] args) {
        Test2<Integer> iObj = new Test2<>(15);
        System.out.println(iObj.getObject());
        Test2<String> sObj = new Test2<>("unity test");
        System.out.println(sObj.getObject());
    }
}
