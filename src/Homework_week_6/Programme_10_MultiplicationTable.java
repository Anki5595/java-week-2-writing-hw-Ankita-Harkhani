package Homework_week_6;

/*Write a Java program that takes a number as input and prints its
multiplication table up to 10.
Test Data: Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80
*/

import java.util.Scanner;

public class Programme_10_MultiplicationTable {
    public static void main(String[] args) {
        //scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int number = scanner.nextInt();
        multiplicationOf(number);
        //closing the scanner object
        scanner.close();
    }

    //Printing the multiplication table of entered number
    public static void multiplicationOf(int number) {
        System.out.println(number + " X " + 1 + " = " + (number));
        System.out.println(number + " X " + 2 + " = " + (number * 2));
        System.out.println(number + " X " + 3 + " = " + (number * 3));
        System.out.println(number + " X " + 4 + " = " + (number * 4));
        System.out.println(number + " X " + 5 + " = " + (number * 5));
        System.out.println(number + " X " + 6 + " = " + (number * 6));
        System.out.println(number + " X " + 7 + " = " + (number * 7));
        System.out.println(number + " X " + 8 + " = " + (number * 8));
        System.out.println(number + " X " + 9 + " = " + (number * 9));
        System.out.println(number + " X " + 10 + " = " + (number * 10));

    }
}
