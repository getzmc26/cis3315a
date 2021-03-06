package week4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Matt Getz
 */
public class C12N24SalaryFile {

    public static String getRank() {
        String[] ranks = {"        Assistant        ",
            "        Associate        ", "        Full             "};
        return ranks[(int) (Math.random() * ranks.length)];
    }

    public static double getSalary(String rank) {
        if (rank.equals("Assistant")) {
            return 50000 + (double) (Math.random() * 30001); //$80,000 cap
        } else if (rank.equals("Associate")) {
            return 60000 + (double) (Math.random() * 50001); //$110,000 cap
        } else {
            return 75000 + (double) (Math.random() * 55001); //$130,000 cap
        }
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {
        File file = new File("Salary.txt");

        if (!file.exists()) {
            System.out.println("File " + file.getName() + " already exists.");
            System.exit(0);
        }
        String rank = "";
        double salary;
        try (PrintWriter output = new PrintWriter(file);) {
            output.printf("FirstName       LastName             Rank             Salary\n");
            output.printf("-----------------------------------------------------------------\n");
            for (int i = 1; i <= 1000; i++) {
                output.print("FirstName   " + i + "   LastName   " + i);
                rank = getRank();
                salary = getSalary(rank);
                output.printf(" " + rank + "$" + " %.2f\n", salary);
                output.printf("\n");
            }
        }
        BufferedReader br = new BufferedReader(new FileReader("Salary.txt"));
        for (String line; (line = br.readLine()) != null;) {
            System.out.print(line + "\n");
        }
    }
}
