package hw5;

import java.util.Random;

public class Task2 {

    public static void main(String[] args) {
        Random random = new Random();
        int sec = random.nextInt(1354);

        System.out.println("Осталось секунд: " + sec);

        int hours = sec / 3600;
        int remSeconds = sec % 3600;

        if (hours > 0) {
            System.out.println("Осталось " + hours + " часов");
        } else if (remSeconds >= 0 && remSeconds <= 3600) {
            System.out.println("Остался 1 час");
        } else {
            System.out.println("Осталось менее часа");
        }
    }
}
