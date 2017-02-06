package week2;

import java.util.Arrays;
import java.util.Scanner;



/**
 * Write a method that reverses an array.
 * @author Matt
 */
public class C7N12 {
    public static double[] backward(int n, double[] x) {        
        double[] y = new double[n];
        
        for (int i=0, j=n-1; i<n; i++, j--) {
           y[j] = x[i];
        }
        
        System.out.println("\n");
        System.out.print("Array forward: " + Arrays.toString(x));
        System.out.println("\n");
        System.out.print("Array backward: ");
        return y;
    }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of numbers to store: ");
        int n = sc.nextInt();
        
        double[] x = new double[n];
        System.out.print("Enter each number separated by a single space: ");
        for (int i=0; i < n; i++) {
            x[i] = sc.nextDouble();
        }
        
        System.out.println(Arrays.toString(C7N12.backward(n, x)));
    }
}
