package week4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Each line in the file consists of a faculty member’s first name, last name,
 * rank, and salary. Display the total salary and average salary for all
 * professors and faculty.
 *
 * @author Matt Getz
 */
public class C12N25SalaryTotals {

    public static double getTotal(ArrayList<Double> x) {
        double total = 0;
        for (int i = 0; i < x.size(); i++) {
            total += x.get(i);
        }
        return total;
    }

    public static void processData(ArrayList<Double> a, ArrayList<Double> b,
            ArrayList<Double> c, String rank, double salary) {
        if (rank.equals("assistant")) {
            a.add(salary);
        } else if (rank.equals("associate")) {
            b.add(salary);
        } else if (rank.equals("full")) {
            c.add(salary);
        }
    }

    public static void main(String[] args) {
        ArrayList<Double> assistant = new ArrayList<>();
        ArrayList<Double> associate = new ArrayList<>();
        ArrayList<Double> full = new ArrayList<>();

        try {
            java.net.URL url = new java.net.URL(
                    "http://cs.armstrong.edu/liang/data/Salary.txt");
            Scanner sc = new Scanner(url.openStream());
            while (sc.hasNext()) {
                String[] line = (sc.nextLine()).split(" ");
                processData(assistant, associate, full, line[2],
                        new Double(line[3]));
            }
        } catch (java.net.MalformedURLException ex) {
            System.out.println("Invalid URL");
            System.exit(0);
        } catch (java.io.IOException ex) {
            System.out.println("I/O Errors: no such file");
            System.exit(1);
        }

        double totalAssistant = getTotal(assistant);
        double totalAssociate = getTotal(associate);
        double totalFull = getTotal(full);
        double totalFaculty = (totalAssistant + totalAssociate + totalFull);

        System.out.println("\nTotal salary:\n");
        System.out.printf("Assistant professors:      $%.2f\n", totalAssistant);
        System.out.printf("Associate professors:      $%.2f\n", totalAssociate);
        System.out.printf("Full professors:           $%.2f\n", totalFull);
        System.out.println("_______________________________________");
        System.out.printf("All faculty:               $%.2f\n", totalFaculty);

        System.out.println("\n");

        System.out.println("\nAverage salary:\n");
        System.out.printf("Assistant professors:      $%.2f\n",
                (totalAssistant / assistant.size()));
        System.out.printf("Associate professors:      $%.2f\n",
                (totalAssociate / associate.size()));
        System.out.printf("Full professors:           $%.2f\n",
                (totalFull / full.size()));
        System.out.println("_____________________________________");
        System.out.printf("All faculty:               $%.2f\n",
                (totalFaculty / (assistant.size() + associate.size() + full.size())));
    }
}
