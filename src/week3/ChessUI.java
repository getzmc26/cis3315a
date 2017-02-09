package week3;

import java.util.Scanner;

/**
 *
 * @author Matt Getz
 */
public class ChessUI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ChessBoard chess = new ChessBoard();
        
        int x = chess.count;
        String y = chess.toString();
        int[] movement = new int[4];
        
        int stop = 1;
        System.out.println(chess);
        while (stop != 2) {
            if (x % 2 == 0) {
                System.out.print("Play a move = 1 , Quit = 2: ");
                int end = sc.nextInt();
                if (end == 1) {
                    stop = 1;
                }
                else if (end == 2) {
                    break;
                }
                else {
                    System.out.println("Please enter a 1 or a 2.");
                }
                System.out.print("Player WHITE enter move from and move to: ");
                for (int i=0; i<4; i++) {
                    movement[i] = sc.nextInt();
                }
                System.out.println("Move from " + movement[0] + "," + movement[1] +
                        " to " + movement[2] + "," + movement[3]);
                chess.move(movement[0], movement[1], movement[2], movement[3]);
                System.out.println("\n");
                System.out.println(chess);
                x++;
            }
            else {
                System.out.print("Play a move = 1 , Quit = 2: ");
                int end = sc.nextInt();
                if (end == 1) {
                    stop = 1;
                }
                else if (end == 2) {
                    break;
                }
                else {
                    System.out.println("Please enter a 1 or a 2.");
                }
                System.out.print("Player BLACK enter move from and move to: ");
                for (int i=0; i<4; i++) {
                    movement[i] = sc.nextInt();
                }
                System.out.println("Move from " + movement[0] + "," + movement[1] +
                        " to " + movement[2] + "," + movement[3]);
                chess.move(movement[0], movement[1], movement[2], movement[3]);
                System.out.println("\n");
                System.out.println(chess);
                x++;
            }
        }
        System.out.println("Thanks for playing!");
    }
}
