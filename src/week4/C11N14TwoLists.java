package week4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Prompts user to enter to lists of numbers. List y is added to the end of 
 * list x in a new list z.
 * @author Matt Getz
 */
public class C11N14TwoLists {
    
    public static void combine(ArrayList<Integer> x, ArrayList<Integer> y) {
        ArrayList<Integer> z = new ArrayList<>();
        for (int i = 0; i < x.size(); i++) {
            z.add(x.get(i));
        }
        for (int i = 0; i < y.size(); i++) {
            z.add(y.get(i));
        }
        System.out.println("\nThe two lists combined: " + z);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> x = new ArrayList<>();
        ArrayList<Integer> y = new ArrayList<>();
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
        System.out.print("\nEnter the number(s) that you want to add and end with a zero: ");
        while (sc.hasNext()) {
            int num = sc.nextInt();
            if (num == 0) {
                break;
            }
            else {
                y.add(num);
            }
        }
        System.out.println("\nYour first list is: " + x);
        System.out.println("\nYour second list is: " + y);
        combine(x,y);
    }
}
