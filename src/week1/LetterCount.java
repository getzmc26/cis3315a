package week1;

import java.util.Scanner;

/**
 *
 * @author Matt Getz
 */
public class LetterCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String letters = sc.nextLine();
        int countV = 0;
        int countC = 0;
        for (int i=0; i<letters.length(); i++) {
            if (letters.charAt(i) == ' ') {
                ;
            }
            else if (letters.charAt(i) == 'a' || letters.charAt(i) == 'e' 
                    || letters.charAt(i) == 'i' || letters.charAt(i) == 'o'
                    || letters.charAt(i) == 'u' || letters.charAt(i) == 'A'
                    || letters.charAt(i) == 'E' || letters.charAt(i) == 'I' 
                    || letters.charAt(i) == 'O' || letters.charAt(i) == 'U') {
                countV++;
            }
            else {
                countC++;
            }
        }
        System.out.println("\nThe number of vowels is: " + countV);   
        System.out.println("\nThe number of consonants is: " + countC);   
    }
}
