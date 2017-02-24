package week2;


/**
 * Generate 100 random upper case letters and 100 random integers, with the 
 * output printing 10 characters per line.
 * @author Matt Getz
 */
public class C6N38 {
    public static char getRandomCharacter(char ch1, char ch2) {
        return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
    }
    
    public static char getRandomLetters() {
        return getRandomCharacter('A', 'Z');
    }
    
    public static char getRandomIntegers() {
        return getRandomCharacter('0', '9');
    }

    public static void main(String[] args) { 
        
        for (int i=0; i<100; i++) {
            if (i % 10 == 0) {
                System.out.println("\n");
            }
            System.out.print(C6N38.getRandomLetters());
        }
        
        System.out.println("\n");
        System.out.println("----------");
        
        for (int i=0; i<100; i++) {
            if (i % 10 == 0) {
                System.out.println("\n");
            } 
            System.out.print(C6N38.getRandomIntegers());
        }
        System.out.println("\n");
    }
}
