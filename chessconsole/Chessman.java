package chessconsole;

/**
 * This class represents a single chessman which is represented by a one letter
 * symbol. Lowercase letters are used for white pieces and uppercase letters are
 * used for black pieces. A dash (-) indicates a non-existent piece.
 *
 * @author John Phillips
 */
public class Chessman {

    /**
     * String contains the one character symbols used to represent the chessmen.
     */
    public final static String SYMBOLS = "rhbqkp-";

    /**
     * String array that contains the names of each type of chessman.
     */
    public final static String[] NAMES = {"rook", "knight", "bishop", "queen",
        "king", "pawn", "empty"};

    /**
     * Array of doubles that represents the point value of each chessman.
     */
    public final static double[] POINTS = {5, 3, 3.5, 9, 2, 1, 0};

    /**
     * A String that contains a single letter that represents the type of
     * chessman.
     */
    protected String symbol; // rhbqkpRHBQKP-

    /**
     * Constructs a new chessman object for a given symbol.
     *
     * @param symbol
     */
    public Chessman(String symbol) {
        this.symbol = symbol;
    }

    /**
     * Checks to see if the symbol is valid.
     *
     * @param s
     * @return true or false
     */
    public boolean isValidSymbol(String s) {
        return s.matches("^[rhbqkpRHBQKP-]$");
    }

    /**
     * Gets the symbol representation of the chessman.
     *
     * @return symbol
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * Gets the name of the chessman.
     *
     * @return name
     */
    public String getName() {
        return NAMES[SYMBOLS.indexOf(symbol.toLowerCase())];
    }

    /**
     * Gets the point value for this piece.
     *
     * @return
     */
    public double getPoints() {
        return POINTS[SYMBOLS.indexOf(symbol.toLowerCase())];
    }

    /**
     * Returns the symbol representation of the chessman.
     *
     * @return symbol
     */
    @Override
    public String toString() {
        return getSymbol();
    }
}
