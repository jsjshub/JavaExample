public class ControllerMain extends Controller {
    @Override
    public void run() {
        System.out.println("배번 바뀜");
    }

    public static void main(String[] args) {
        Controller c = new ControllerMain();
        c.execute();
    }
}