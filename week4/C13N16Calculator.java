package week4;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Create a rational-number calculator. Practice problem 7.9 is similar.
 * This is the not the solution the text wanted. But it will add, subtract,
 * multiply, and divide rational numbers.
 *
 * @author Matt Getz
 */
public class C13N16Calculator {

    private int firstNumerator;
    private int firstDenominator;
    private int secondNumerator;
    private int secondDenominator;

    public C13N16Calculator(int firstNumerator, int firstDenominator,
            int secondNumerator, int secondDenominator) {
        this.firstNumerator = firstNumerator;
        this.firstDenominator = firstDenominator;
        this.secondNumerator = secondNumerator;
        this.secondDenominator = secondDenominator;
    }

    public int getFirstNumerator() {
        return firstNumerator;
    }

    public void setFirstNumerator(int firstNumerator) {
        this.firstNumerator = firstNumerator;
    }

    public int getFirstDenominator() {
        return firstDenominator;
    }

    public void setFirstDenominator(int firstDenominator) {
        this.firstDenominator = firstDenominator;
    }

    public int getSecondNumerator() {
        return secondNumerator;
    }

    public void setSecondNumerator(int secondNumerator) {
        this.secondNumerator = secondNumerator;
    }

    public int getSecondDenominator() {
        return secondDenominator;
    }

    public void setSecondDenominator(int secondDenominator) {
        this.secondDenominator = secondDenominator;
    }

    public void add() {
        DecimalFormat df = new DecimalFormat("#.00");

        double fractionOne = (double) getFirstNumerator() / getFirstDenominator();
        double fractionTwo = (double) getSecondNumerator() / getSecondDenominator();
        int fractionConvertOne = (int) (fractionOne * 10);
        int fractionConvertTwo = (int) (fractionTwo * 10);
        int decimalConvertOne = fractionConvertOne % 10;
        int decimalConvertTwo = fractionConvertTwo % 10;
        double decimalOne = decimalConvertOne * 0.1;
        double decimalTwo = decimalConvertTwo * 0.1;
        double answer = decimalOne + decimalTwo;
        String answerFormatted = df.format(answer);

        System.out.println("\n" + getFirstNumerator() + "/" + getFirstDenominator() + " + "
                + getSecondNumerator() + "/" + getSecondDenominator() + " = "
                + answerFormatted);
    }

    public void subtract() {
        DecimalFormat df = new DecimalFormat("#.00");

        double fractionOne = (double) getFirstNumerator() / getFirstDenominator();
        double fractionTwo = (double) getSecondNumerator() / getSecondDenominator();
        int fractionConvertOne = (int) (fractionOne * 10);
        int fractionConvertTwo = (int) (fractionTwo * 10);
        int decimalConvertOne = fractionConvertOne % 10;
        int decimalConvertTwo = fractionConvertTwo % 10;
        double decimalOne = decimalConvertOne * 0.1;
        double decimalTwo = decimalConvertTwo * 0.1;
        double answer = decimalOne - decimalTwo;
        String answerFormatted = df.format(answer);

        System.out.println("\n" + getFirstNumerator() + "/" + getFirstDenominator() + " - "
                + getSecondNumerator() + "/" + getSecondDenominator() + " = "
                + answerFormatted);
    }

    public void mulitply() {
        DecimalFormat df = new DecimalFormat("#.00");

        double fractionOne = (double) getFirstNumerator() / getFirstDenominator();
        double fractionTwo = (double) getSecondNumerator() / getSecondDenominator();
        int fractionConvertOne = (int) (fractionOne * 10);
        int fractionConvertTwo = (int) (fractionTwo * 10);
        int decimalConvertOne = fractionConvertOne % 10;
        int decimalConvertTwo = fractionConvertTwo % 10;
        double decimalOne = decimalConvertOne * 0.1;
        double decimalTwo = decimalConvertTwo * 0.1;
        double answer = decimalOne * decimalTwo;
        String answerFormatted = df.format(answer);

        System.out.println("\n" + getFirstNumerator() + "/" + getFirstDenominator() + " x "
                + getSecondNumerator() + "/" + getSecondDenominator() + " = "
                + answerFormatted);
    }

    public void divide() {
        DecimalFormat df = new DecimalFormat("#.00");

        while (true) {
            if (getFirstDenominator() == 0 || getSecondDenominator() == 0) {
                System.out.println("\nDivide by zero error");
                break;
            }

            double fractionOne = (double) getFirstNumerator() / getFirstDenominator();
            double fractionTwo = (double) getSecondNumerator() / getSecondDenominator();
            int fractionConvertOne = (int) (fractionOne * 10);
            int fractionConvertTwo = (int) (fractionTwo * 10);
            int decimalConvertOne = fractionConvertOne % 10;
            int decimalConvertTwo = fractionConvertTwo % 10;
            double decimalOne = decimalConvertOne * 0.1;
            double decimalTwo = decimalConvertTwo * 0.1;
            double answer = decimalOne / decimalTwo;
            String answerFormatted = df.format(answer);

            System.out.println("\n" + getFirstNumerator() + "/" + getFirstDenominator() + " / "
                    + getSecondNumerator() + "/" + getSecondDenominator() + " = "
                    + answerFormatted);
            break;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the numerator of the first number?: ");
        int a = sc.nextInt();
        System.out.print("What is the denominator of the first number?: ");
        int b = sc.nextInt();
        System.out.print("What is the numerator of the second number?: ");
        int c = sc.nextInt();
        System.out.print("What is the denominator of the second number?: ");
        int d = sc.nextInt();

        C13N16Calculator c1 = new C13N16Calculator(a, b, c, d);

        while (true) {
            System.out.print("\nDo you want to add ('1'), subtract ('2'), multiply"
                    + " ('3'), or divide ('4') these numbers?"
                    + " (enter corresponding number): ");
            int userChoice = sc.nextInt();
            if (userChoice == 1) {
                c1.add();
                break;
            } else if (userChoice == 2) {
                c1.subtract();
                break;
            } else if (userChoice == 3) {
                c1.mulitply();
                break;
            } else if (userChoice == 4) {
                c1.divide();
                break;
            } else {
                System.out.println("\nPlease enter a 1, 2, 3, or 4.");
            }
        }
    }
}
