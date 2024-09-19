
public class Main extends Thread{
    public static void main(String[] args) {
        Main thread = new Main();
        thread.start();
        System.out.println("The original thread that runs the main method.");
    }

    @Override
    public void run() {
        System.out.println("This code is running in a thread");
    }
}