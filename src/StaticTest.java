public class StaticTest {
    public static void main(String[] args) {
        System.out.println("Hello");
    }

    static int i;

    static {
        i = 500;
        System.out.println("i = " + i);
    }
}
