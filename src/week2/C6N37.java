package week2;

import java.util.Scanner;

/**
 * Pass a number and a width. "Width" specifies the number of integers in the
 * output, with the final number(s) being the entered "number."
 *
 * @author Matt
 */
public class C6N37 {

    public static String format(int number, int width) {
        int length = String.valueOf(number).length();
        String widthFormatted = "";
        String numberFormatted = Integer.toString(number);

        for (int i = 0; i < width - length; i++) {
            widthFormatted += "0";
        }
        return widthFormatted + numberFormatted;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.print("Enter a width: ");
        int width = sc.nextInt();

        System.out.println("\n" + C6N37.format(number, width) + "\n");

// Hard-coded examples:        
        System.out.println(C6N37.format(34, 5));
        System.out.println(C6N37.format(34, 4));
        System.out.println(C6N37.format(34, 3));
        System.out.println(C6N37.format(34, 2));
        System.out.println(C6N37.format(34, 1));
    }
}
