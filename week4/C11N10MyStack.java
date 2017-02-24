package week4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Asks user to create 5 lists. Reverses the order of the list and prints.
 * @author Matt Getz
 */
public class C11N10MyStack {

    public static void sort(ArrayList<Integer> x) {
        java.util.Collections.sort(x);
        java.util.Collections.reverse(x);
        System.out.print("The sorted list is: " + x + "\n");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        ArrayList<Integer> c = new ArrayList<>();
        ArrayList<Integer> d = new ArrayList<>();
        ArrayList<Integer> e = new ArrayList<>();
        int count = 1;

        System.out.print("\nEnter the number(s) that you want to add and end with a zero: ");
        while (sc.hasNext()) {
            int num = sc.nextInt();
            if (num == 0) {
                break;
            }
            else {
                a.add(num);
            }
        }

        System.out.print("\nEnter the number(s) that you want to add and end with a zero: ");
        while (sc.hasNext()) {
            int num = sc.nextInt();
            if (num == 0) {
                break;
            }
            else {
                b.add(num);
            }
        }

        System.out.print("\nEnter the number(s) that you want to add and end with a zero: ");
        while (sc.hasNext()) {
            int num = sc.nextInt();
            if (num == 0) {
                break;
            }
            else {
                c.add(num);
            }
        }

        System.out.print("\nEnter the number(s) that you want to add and end with a zero: ");
        while (sc.hasNext()) {
            int num = sc.nextInt();
            if (num == 0) {
                break;
            }
            else {
                d.add(num);
            }
        }

        System.out.print("\nEnter the number(s) that you want to add and end with a zero: ");
        while (sc.hasNext()) {
            int num = sc.nextInt();
            if (num == 0) {
                break;
            }
            else {
                e.add(num);
            }
        }
        
        System.out.println("\n");
        System.out.println("\nYour first list is: " + a);
        sort(a);
        System.out.println("\nYour second list is: " + b);
        sort(b);
        System.out.println("\nYour third list is: " + c);
        sort(c);
        System.out.println("\nYour fourth list is: " + d);
        sort(d);
        System.out.println("\nYour fifth list is: " + e);
        sort(e);
    }
}
