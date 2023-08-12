public class AbstractClassTest extends AbstractData {
    @Override
    public void sayHi() {
        System.out.println("안녕하세요!");
    }

    public static void main(String[] args) {
        AbstractClassTest ac = new AbstractClassTest();
        ac.sayHi();
        ac.sayGoodbye();
    }
}
