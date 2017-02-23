package week4;

import java.util.Random;
import java.util.Scanner;

/**
 * User enters an integer. If the integer is "in bounds" 1- 100, then the random
 * integer assigned to the index at the user inputted integer is returned. If
 * out of bounds, input is less than 1 or greater than 100, then out of bounds
 * message is printed.
 * @author Matt Getz
 */
public class C12N03ArrayOutOfBounds {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int[] x = new int[101];

        Outer:
        while (true) {
            System.out.print("Enter the index of an array: ");
            int indexChoice = sc.nextInt();
            if (indexChoice >= 1 && indexChoice <= 100) {
                for (int i = 0; i < x.length; i++) {
                    x[i] = rand.nextInt(100) + 1;
                    if (indexChoice == i) {
                        System.out.println("The number at index " +
                                indexChoice + " is: " + x[i]);
                        System.out.println("\n");
                        break Outer;
                    }
                }
            } else {
                System.out.println("\nOut of Bounds\n");
            }
        }
    }
}
