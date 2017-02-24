package week1;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author Matt
 */
public class GuessGame {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        boolean endGame = false;

        while (endGame == false) {
            int answer = rand.nextInt(10) + 1;
            System.out.println("\nGuess the Number!");
            System.out.println("-----------------");
            System.out.print("Please choose a number between 1 and 10: ");

            boolean endLoop = false;
            while (endLoop == false) {
                int guess = sc.nextInt();
                if (guess == answer) {
                    System.out.print("\nCorrect!");
                    break;
                } 
                else if (guess >= answer) {
                    System.out.print("\nThe number is lower. Try again: ");
                }
                else {
                    System.out.print("\nThe number is higher. Try again: ");
                }
            }
            System.out.print("\nPlay again? (y to start again): ");
            if (sc.nextLine().equals("y")) {
                System.out.println("Let's go!");
            }
            else if (!sc.nextLine().equals("y")){
                endGame = true;
            }
        }
    }
}
