package week4;

import java.util.Scanner;

/**
 * Convert a hex number into a number. Throw an exception user entry is not
 * a hex number.
 * @author Matt Getz
 */
public class C12N6NumberFormatException {

    public static int hexToDecimal(String hex) throws NumberFormatException {
        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++) {
            if (hex.charAt(i) == 'A' || hex.charAt(i) == 'B'
                    || hex.charAt(i) == 'C' || hex.charAt(i) == 'D'
                    || hex.charAt(i) == 'E' || hex.charAt(i) == 'F'
                    || hex.charAt(i) == '0' || hex.charAt(i) == '1'
                    || hex.charAt(i) == '2' || hex.charAt(i) == '3'
                    || hex.charAt(i) == '4' || hex.charAt(i) == '5'
                    || hex.charAt(i) == '6' || hex.charAt(i) == '7'
                    || hex.charAt(i) == '8' || hex.charAt(i) == '9') {
                char hexChar = hex.charAt(i);
                decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
            } else {
                throw new NumberFormatException("String is not a hex string");
            }
        }
        return decimalValue;
    }

    public static int hexCharToDecimal(char ch) {
        if (ch >= 'A' && ch <= 'F') {
            return 10 + ch - 'A';
        } else {
            return ch - '0';
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a hex number: ");
        String hex = sc.nextLine();
        try {
            System.out.println("The decimal value for hex number " + hex + 
                    " is: " + hexToDecimal(hex.toUpperCase()));
        } catch (NumberFormatException ex) {
            System.out.println(ex.getMessage());
        }
    }
}