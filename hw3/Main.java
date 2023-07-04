package hw3;

public class Main {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 15;

        int additionResult = addition(num1, num2);
        int subtractionResult = subtraction(num1, num2);
        int multiplicationResult = multiplication(num1, num2);
        double divisionResult = division(num1, num2);

        System.out.println("Addition: " + additionResult);
        System.out.println("Subtraction: " + subtractionResult);
        System.out.println("Multiplication: " + multiplicationResult);
        System.out.println("Division: " + divisionResult);
    }


    public static int addition(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    public static double division(int num1, int num2) {
        return (double) num1 / num2;
    }
}
