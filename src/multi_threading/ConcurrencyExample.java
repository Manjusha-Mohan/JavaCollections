package multi_threading;

public class ConcurrencyExample extends Thread{
    public static int amount = 0;

    public static void main(String[] args) {
        ConcurrencyExample thread = new ConcurrencyExample();
        thread.start();
        //wait for the thread to finish
        while (thread.isAlive()){
            System.out.println("Waiting..");
        }
        //update the amount
        System.out.println("Main: " + amount);
        amount++;
        System.out.println("Main: " + amount);
    }
    public void run(){
        amount++;
    }

}
