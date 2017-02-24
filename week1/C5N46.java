package week1;

import java.util.Scanner;

/**
 * Write a program that prompts the user to enter a string and displays the
 * string in reverse order.
 * @author Matt Getz
 */
public class C5N46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String forward = "";
        String reverse = "";
        
        System.out.print("Enter a string: ");
        forward = forward + sc.nextLine();
        
        int length = forward.length();
        for(int i=length-1; i>=0; i--) {
            reverse = reverse + forward.charAt(i);
        }
        System.out.println("\nString reversed is: " + reverse);
    }   
}
