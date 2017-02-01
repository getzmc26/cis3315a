package week2;

import java.util.Arrays;



/**
 *
 * @author Matt
 */
public class BackwardsArray {
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
}
