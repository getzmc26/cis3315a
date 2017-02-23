package week4;

import java.util.Scanner;

/**
 * Read in the Gettysburg Address from the given URL. Count the total number of
 * words and print it out.
 *
 * @author Matt Getz
 */
public class C12N19GettysburgWordCount {

    public static void main(String[] args) {
        try {
            java.net.URL url = new java.net.URL(
                    "http://cs.armstrong.edu/liang/data/Lincoln.txt");

            int count = 0;
            Scanner sc = new Scanner(url.openStream());
            while (sc.hasNext()) {
                if (Character.isLetter((sc.next()).charAt(0))) {
                    count++;
                }
            }
            System.out.println(
                    "There are " + count + " words in Abraham Lincoln's Gettysburg Address.");
        } catch (java.net.MalformedURLException ex) {
            System.out.println("Invalid URL");
        } catch (java.io.IOException ex) {
            System.out.println("I/0 Errors: no such file");
        }
    }
}
