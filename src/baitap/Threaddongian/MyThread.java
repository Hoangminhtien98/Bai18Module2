package baitap.Threaddongian;

public class MyThread extends Thread{
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("One " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
