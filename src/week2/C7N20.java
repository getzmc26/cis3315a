package week2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Sort numbers using a Selection Sort that finds the largest numbers and places
 * them at the end of the list.
 * @author Matt
 */
public class C7N20 {
    public static String sortLargestLast(int[] x) {
        for (int i = x.length-1; i > 0; i--) {
           
            int currentMax = x[i];
            int currentMaxIndex = i;
 
            for (int j = 0; j < i; j++) {
                if (currentMax < x[j]) {
                    currentMax = x[j];
                    currentMaxIndex = j;
                }
            }
 
            if (currentMaxIndex != i) {
                x[currentMaxIndex] = x[i];
                x[i] = currentMax;
            }
        }
        return Arrays.toString(x);
    }
    
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
        System.out.println(C7N20.sortLargestLast(x));
    }
}
