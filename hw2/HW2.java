package hw2;

public class HW2 {
    public static void main(String[] args) {

        String myStr1 = new String("I study Basic Java");
        String myStr2 = "I study Basic Java";
        System.out.println(myStr2.charAt(16));
        System.out.println(myStr2.contains("Java"));
        System.out.println(myStr2.substring(14));
        System.out.println(myStr2.replace('a','o'));
        System.out.println(myStr2.toUpperCase());
        System.out.println(myStr2.toLowerCase());

    }
}

