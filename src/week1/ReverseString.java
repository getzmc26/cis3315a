package week1;

import java.util.Scanner;

/**
 *
 * @author Matt Getz
 */
public class ReverseString {
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
