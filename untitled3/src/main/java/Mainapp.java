public class Mainapp {
    public static void main(String[] args) {
        try {

            majmoo();
            majmoo();
            majmoo();
            majmoo();
            majmoo();
        } catch (Exception e) {
            System.out.println("your in a wrong dear!!!!!");
        }

    }

    public static void majmoo() throws Exception {
        Integer num1 = 10;
        Integer num2 = 20;
        Integer sum = num1 + num2;
        System.out.println(sum);
        throw new Exception("wrong");
    }
}
