package hw4;

import java.util.Scanner;

public class WordDivision {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Первое слово = ");
        String word1 = myScanner.nextLine();

        System.out.println("Второе слово = ");
        String word2 = myScanner.nextLine();

        int halfWord1 = word1.length() / 2;
        int halfWord2 = word2.length() / 2;

        String multipleWord = word1.substring(0, halfWord1) + word2.substring(0,halfWord2);

        System.out.println("Резултат " + multipleWord);

        myScanner.close();

    }






}
