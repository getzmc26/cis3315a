package week2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Matt
 */
public class BackwardsArrayApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of numbers to store: ");
        int n = sc.nextInt();
        
        double[] x = new double[n];
        System.out.print("Enter each number separated by a single space: ");
        for (int i=0; i < n; i++) {
            x[i] = sc.nextDouble();
        }
        
        System.out.println(Arrays.toString(BackwardsArray.backward(n, x)));
    }
}
