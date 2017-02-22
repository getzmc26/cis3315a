package week4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * User enters a list of numbers. The maximum value in the list is returned.
 *
 * @author Matt Getz
 */
public class C11N4MaxValueInList {

    public static Integer max(ArrayList<Integer> x) {
        java.util.Collections.sort(x);
        return x.get(x.size() - 1);
    }

//    public static Integer max(ArrayList<Integer> x) {
//            int max = x.get(0);
//            for (int i = 0; i<x.size(); i++) {
//                if (x.get(i) > max) {
//                    max = x.get(i);
//                }
//            }
//        return max;    
//    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> x = new ArrayList<>();
        System.out.print("\nEnter the number(s) that you want to add and end with a zero: ");
        while (sc.hasNext()) {
            int num = sc.nextInt();
            if (num == 0) {
                break;
            }
            else {
                x.add(num);
            }
        }
        System.out.println("\nYour list is: " + x);
        System.out.println("\nThe max number in this array is: " + C11N4MaxValueInList.max(x));
    }
}
