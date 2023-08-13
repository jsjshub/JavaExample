package util;

public class CarExample {
    public static void main(String[] args) {
        Car01 car01 = new Car01() {
            @Override
            public void test() {
                System.out.println("HI");
            }
        };

        car01.test();
    }
}
