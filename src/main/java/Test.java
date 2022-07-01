import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter a something and I will tell you if it is a number.");
        String isNumInput = sc.nextLine();
        System.out.println(StringUtils.isNumeric(isNumInput));

        System.out.println("\nEnter some text and I will swap its character case from lower to upper and vise versa.");
        String strToSwap = sc.nextLine();
        System.out.println(StringUtils.swapCase(strToSwap));

        System.out.println("\nEnter some text and I will reverse it.");
        String strToReverse = sc.nextLine();
        System.out.println(StringUtils.reverse(strToReverse));

//        System.out.println("\nEnter a something and I will tell you if it is a number.");
//        String userInput = sc.nextLine();
//        System.out.println(StringUtils.isNumeric(userInput));
//
//        System.out.println(StringUtils.swapCase(userInput));
//
//        System.out.println(StringUtils.reverse(userInput));


        //todo: 1. Tells whether or not what the user entered is a number
        //      2. Flips the case of the string
        //      3. Reverses the string

//        System.out.println(StringUtils.isNumeric("33")); // returns a boolean.
//        System.out.println(StringUtils.swapCase("Hello World")); // returns string in reverse case.
//        System.out.println(StringUtils.reverse("Hello World")); // returns string in reverse.
    }
}
