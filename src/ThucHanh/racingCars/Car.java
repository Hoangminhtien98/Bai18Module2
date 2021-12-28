package ThucHanh.racingCars;

import java.util.Calendar;
import java.util.Random;

import static ThucHanh.racingCars.Main.DISTANCE;
import static ThucHanh.racingCars.Main.STEP;

public class Car implements Runnable {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        //Khởi tạo điểm start
        int runDistance = 0;
        //Khởi tạo time bắt đầu cuộc đua
        long startTime = System.currentTimeMillis();
        //Kiểm tra chừng nào còn xe chưa kết thúc quãng đường đua thì xe vẫn tiếp tục chạy
        while (runDistance < DISTANCE) {
            try {
                //Random speed
                int speed = (new Random()).nextInt(20);
                //Tính quãng đường đã đi
                runDistance += speed;
                //Xây dựng đồ họa kết quả
                String log = "|";
                int percentTravel = (runDistance * 100) / DISTANCE;
                for (int i = 0; i < DISTANCE; i += STEP) {
                    if (percentTravel >= i + STEP) {
                        log += "=";
                    } else if (percentTravel >= i && percentTravel < i + STEP) {
                        log += "o";
                    } else {
                        log += "-";
                    }
                }
                log += "|";
                System.out.println("Chiến thần " + this.name + ": " + log + " " + Math.min(DISTANCE, runDistance) + "km");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Chiến thần " + this.name + "Broken...");
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Chiến thần " + this.name + " Finish in " + (endTime - startTime) / 1000 + "s");
    }
}
