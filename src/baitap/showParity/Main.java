package baitap.showParity;

public class Main {
    public static void main(String[] args) {
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();

        evenThread.start();
        try {
            evenThread.join();
            System.out.println("------------");
        } catch (InterruptedException e) {
            e.printStackTrace();

        }

        oddThread.start();
        try {
            oddThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
