package week4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * User enters a list of numbers. The maximum value in the list is returned.
 * @author Matt Getz
 */
public class C11N4MaxValueInList {

    public static Integer max(ArrayList<Integer> x) {
        if (x.isEmpty()) {
            return null;
        } else {
            java.util.Collections.sort(x);
            return x.get(x.size() - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> x = new ArrayList<>();
        System.out.print("How many numbers are in your list?: ");
        int numOfValues = sc.nextInt();
        System.out.print("\nEnter the " + numOfValues + " number(s) that you want to add: ");
        for (int i = 0; i < numOfValues; i++) {
            x.add(sc.nextInt());
        }
        System.out.println("\nYour list is: " + x);
        System.out.println("\nThe max number in this array is: " + C11N4MaxValueInList.max(x));
    }
}
