package week4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Matt Getz
 */
public class C11N12SumList {

    public static void sum(ArrayList<Integer> x) {
        int sum = 0;
        for (int i = 0; i < x.size(); i++) {
            sum += x.get(i);
        }
        System.out.println("The sum of the numbers in your list is: " + sum);
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
        sum(x);
    }
}
