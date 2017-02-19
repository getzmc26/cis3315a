package week4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
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

        System.out.print("How many 'things' are in list " + count + " ?: ");
        int numOfValues = sc.nextInt();
        System.out.print("\nEnter the " + numOfValues + " number(s) that you want to add: ");
        for (int i = 0; i < numOfValues; i++) {
            a.add(sc.nextInt());
        }

        count++;
        
        System.out.print("How many 'things' are in list " + count + " ?: ");
        numOfValues = sc.nextInt();
        System.out.print("\nEnter the " + numOfValues + " number(s) that you want to add: ");
        for (int i = 0; i < numOfValues; i++) {
            b.add(sc.nextInt());
        }

        count++;
        
        System.out.print("How many 'things' are in list " + count + " ?: ");
        numOfValues = sc.nextInt();
        System.out.print("\nEnter the " + numOfValues + " number(s) that you want to add: ");
        for (int i = 0; i < numOfValues; i++) {
            c.add(sc.nextInt());
        }

        count++;
        
        System.out.print("How many 'things' are in list " + count + " ?: ");
        numOfValues = sc.nextInt();
        System.out.print("\nEnter the " + numOfValues + " number(s) that you want to add: ");
        for (int i = 0; i < numOfValues; i++) {
            d.add(sc.nextInt());
        }

        count++;
        
        System.out.print("How many 'things' are in list " + count + " ?: ");
        numOfValues = sc.nextInt();
        System.out.print("\nEnter the " + numOfValues + " number(s) that you want to add: ");
        for (int i = 0; i < numOfValues; i++) {
            e.add(sc.nextInt());
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
