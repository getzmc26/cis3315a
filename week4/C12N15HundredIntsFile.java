package week4;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Create a file. Generate 100 random integers between 1 and 1000 and save them
 * to the file. Return the the original list and a sorted list from smallest to
 * largest.
 *
 * @author Matt Getz
 */
public class C12N15HundredIntsFile {

    public static void main(String[] args) throws Exception {
        File file = new File("100RandInts.txt");
        if (file.exists()) {
            System.out.println("File created");
            System.exit(0);
        }
        try (PrintWriter output = new PrintWriter(file);) {
            for (int i = 0; i < 100; i++) {
                output.print(((int) (Math.random() * 1000) + 1));
                output.print(" ");
                output.print("\n");
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        try (Scanner sc = new Scanner(file);) {
            while (sc.hasNext()) {
                list.add(sc.nextInt());
            }
        }
        System.out.println("Unsorted list: " + list.toString());
        Collections.sort(list);
        System.out.print("Sorted list: " + list.toString());
        System.out.println();
    }
}
