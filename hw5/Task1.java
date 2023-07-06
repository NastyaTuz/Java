package hw5;

public class Task1 {

    public static void main(String[] args) {

        double m = 9, n = 10.20;

        double difM = Math.abs(m - 10);
        double difN = Math.abs(n - 10);

        if (difM < difN) {
            System.out.println( m + " ближе к 10");
        } else if (difM > difN) {
            System.out.println(n + " ближе к 10");
        } else {
            System.out.println("Не близки к 10");
        }
    }
}
