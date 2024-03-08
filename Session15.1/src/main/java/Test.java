public class Test {
    static <T> void genericDisplay(T element){
        System.out.println(element.getClass().getName()
                + " = " + element);
    }
}
