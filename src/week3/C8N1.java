package week3;

import java.util.Scanner;

/**
 *
 * @author Matt Getz
 */
public class C8N1 {

    public static String colSum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many rows?: ");
        int n = sc.nextInt();
        int[][] x = new int[n][];
        
        int rowNum = 1;
        for (int i = 0; i < n; i++) {
            System.out.println("\n");
            x[i] = new int[n];
            for (int j = 0; j < n; j++) {
                System.out.print("Enter the number at index [" + i + "][" + j + "]: ");
                x[i][j] = sc.nextInt();
            }
            rowNum++;
        }
        System.out.println("\n");
        for (int row = 0; row < x.length; row++) {
            for (int column = 0; column < x[row].length; column++) {
                System.out.print(x[row][column] + " ");
            }
            System.out.println("");
        }
        int colNum = 1;
        System.out.println("\n");
        for (int col = 0; col < x.length; col++) {
            int sum = 0;
            for (int row = 0; row < x.length; row++) {
                sum += x[row][col];
            }
            System.out.print("The sum of column " + colNum + " is: " + sum);
            colNum++;
            System.out.println("\n");
        }    
    return "";    
    }
    
    public static void main(String[] args) {
        System.out.println(colSum());
    }
}
