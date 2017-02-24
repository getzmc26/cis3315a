package week4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Write a program that will count the number of chars, words, and lines in a
 * file.
 *
 * @author Matt Getz
 */
public class C12N13Count {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        File file = new File("Count.txt");
        Scanner sc1 = new Scanner(file);
        Scanner sc2 = new Scanner(file);

        if (!file.exists()) {
            System.out.println("File " + file.getName() + " does not exist.");
            System.exit(0);
        }

        int characters = 0;
        int words = 0;
        int lines = 0;

        while (sc1.hasNext()) {
            lines++;
            String line = sc1.nextLine();
            characters += line.length();
        }

        while (sc2.hasNext()) {
            String line = sc2.next();
            words++;
        }
        
        System.out.println("Count.txt file:");
        System.out.println("------------------");
        BufferedReader br = new BufferedReader(new FileReader("Count.txt"));
        for (String line; (line = br.readLine()) != null;) {
            System.out.print(line + "\n");
        }
        System.out.println("------------------");
        System.out.println("\n");
        System.out.println("There are " + characters + " characters, " + words
                + " words, and " + lines + " lines in the file.");
    }
}
