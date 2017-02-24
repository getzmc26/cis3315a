package week4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * User enters a list of numbers. Numbers in list are summed together and the
 * sum is printed out.
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
        sum(x);
    }
}
