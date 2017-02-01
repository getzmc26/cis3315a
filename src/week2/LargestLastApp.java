package week2;

import java.util.Scanner;

/**
 *
 * @author Matt
 */
public class LargestLastApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of numbers to sort: ");
        int n = sc.nextInt();
        
        System.out.println("\n");
        
        int[] x = new int[n];
        System.out.print("Enter each number separated by a single space: ");
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        
        System.out.println("\n");
        
        System.out.print("Sorted from smallest to largest: ");
        System.out.println(LargestLast.sortLargestLast(x));
    }
}
