public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int count = 1;
        try {
            while (true) {
                Thread.sleep(2 * 1000);
                System.out.println("count: " + count++);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
