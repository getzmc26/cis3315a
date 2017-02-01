package week1;

import java.util.Scanner;

/**
 * Git update comment test.
 * @author Matt Getz
 */
public class CheckSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String isbn = "";
        boolean checkLength = false;
        while (checkLength == false) {
            System.out.print("\nEnter the first 12 digits of an ISBN-13 number " 
                    + "without any spaces or dashes: ");
            isbn += sc.nextLine();
            if (isbn.length() == 12) {
                checkLength = true;
            }
            else {
                System.out.println("\nPLEASE ENTER THE FIRST 12 DIGITS");
            }
        }

        int sumEven = 0;
        for (int i=0; i<isbn.length(); i+=2) {
            char c = isbn.charAt(i);
            sumEven += Character.getNumericValue(c);
        }
        int sumOdd = 0;
        for (int i=1; i<isbn.length(); i+=2) {
            char c = isbn.charAt(i);
            sumOdd += Character.getNumericValue(c)*3;
        }
        int checkSum = 10 - (sumEven + sumOdd) % 10;
        if (checkSum == 10) {
            checkSum += -10;
        }
        System.out.println("\nThe checksum digit is: " + checkSum);
        System.out.println("\nThe full ISBN number is: " + isbn + checkSum);
    }
}