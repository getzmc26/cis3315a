package week4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Matt Getz
 */
public class C11N11SortList {

    public static void sort(ArrayList<Integer> x) {
        java.util.Collections.sort(x);
        System.out.print("The sorted ArrayList is: " + x + "\n");
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
        sort(x);
    }
}
