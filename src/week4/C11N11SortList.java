package week4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * User inputs a list of numbers. List is sorted from smallest to largest.
 * @author Matt Getz
 */
public class C11N11SortList {

    public static void sort(ArrayList<Integer> x) {
        java.util.Collections.sort(x);
        System.out.println("The sorted list is: " + x);
    }

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
        sort(x);
    }
}
