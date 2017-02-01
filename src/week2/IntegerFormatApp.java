package week2;

import java.util.Scanner;

/**
 * Application for Integer Format program.
 *
 * @author Matt
 */
public class IntegerFormatApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.print("Enter a width: ");
        int width = sc.nextInt();

        System.out.println("\n" + IntegerFormat.format(number, width) + "\n");

// Hard-coded examples:        
        System.out.println(IntegerFormat.format(34, 5));
        System.out.println(IntegerFormat.format(34, 4));
        System.out.println(IntegerFormat.format(34, 3));
        System.out.println(IntegerFormat.format(34, 2));
        System.out.println(IntegerFormat.format(34, 1));
    }
}
