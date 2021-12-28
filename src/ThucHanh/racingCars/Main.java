package ThucHanh.racingCars;

public class Main {
    public static int DISTANCE = 100;

    public static int STEP = 2;

    public static void main(String[] args) {
        Car carA = new Car("H");
        Car carB = new Car("Đ");
        Car carC = new Car("Q");
        Car carD = new Car("D");
        Car carE = new Car("T");

        Thread thread1 = new Thread(carA);
        Thread thread2 = new Thread(carB);
        Thread thread3 = new Thread(carC);
        Thread thread4 = new Thread(carD);
        Thread thread5 = new Thread(carE);

        System.out.println("Distance: 100km");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}
