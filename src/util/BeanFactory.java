package util;

public class BeanFactory {
    private static final BeanFactory instance = new BeanFactory();

    private BeanFactory() {

    }

    public static BeanFactory getInstance() {
        return instance;
    }

    public Bus getBus() {
        return new Bus();
    }


    public static void main(String[] args) {
        BeanFactory beanFactory = getInstance();
        beanFactory.getBus();
    }

}
