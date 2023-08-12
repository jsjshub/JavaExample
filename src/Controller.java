public abstract class Controller {
    public void init() {
        System.out.println("초기화");
    }

    public abstract void run();

    public void close() {
        System.out.println("마무리");
    }

    public void execute() {
        init();
        run();
        close();
    }
}
