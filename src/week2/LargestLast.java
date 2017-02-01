package week2;

import java.util.Arrays;

/**
 *
 * @author Matt
 */
public class LargestLast {
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
}
