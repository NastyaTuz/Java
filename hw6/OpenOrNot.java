package hw6;

import java.util.Scanner;

public class OpenOrNot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение открыт/неоткрыт isEdekaOpen: ");
        boolean isEdekaOpen = scanner.nextBoolean();

        System.out.print("Введите значение открыт/неоткрыт isEdekaOpen: ");
        boolean isReweOpen = scanner.nextBoolean();

        boolean canBuyFood = canBuy(isEdekaOpen, isReweOpen);

        if (canBuyFood) {
            System.out.println("Я могу купить еду, это правда!");
        } else {
            System.out.println("Я не могу купить еду, это ложь.");
        }
    }

    public static boolean canBuy(boolean isEdekaOpen, boolean isReweOpen) {
        return isEdekaOpen || isReweOpen;
    }

}
