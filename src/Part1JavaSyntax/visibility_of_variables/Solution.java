package Part1JavaSyntax.visibility_of_variables;

public class Solution {

    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.addPrice(50);
        Apple apple2 = new Apple();
        apple2.addPrice(100);
        System.out.println("The price of apple is: " + Apple.applePrice);
    }

    public static class Apple {
        public static int applePrice = 0;

        public static void addPrice(int applePrice) {

            // System.out.println(applePrice);
            // System.out.println(Apple.applePrice);

            Apple.applePrice = applePrice + Apple.applePrice;

        }
    }
}

