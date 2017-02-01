package week2;

/**
 * Pass a number and a width. "Width" specifies the number of integers in the
 * output, with the final number(s) being the entered "number."
 *
 * @author Matt
 */
public class IntegerFormat {

    public static String format(int number, int width) {
        int length = String.valueOf(number).length();
        String widthFormatted = "";
        String numberFormatted = Integer.toString(number);

        for (int i = 0; i < width - length; i++) {
            widthFormatted += "0";
        }
        return widthFormatted + numberFormatted;
    }
}
