package week2;

/**
 * Application for RandomLettersNumbers.
 * @author Matt Getz
 */
public class RandomLettersNumbersApp {
        public static void main(String[] args) { 
        
        for (int i=0; i<100; i++) {
            if (i % 10 == 0) {
                System.out.println("\n");
            }
            System.out.print(RandomLettersNumbers.getRandomLetters());
        }
        
        System.out.println("\n");
        System.out.println("----------");
        
        for (int i=0; i<100; i++) {
            if (i % 10 == 0) {
                System.out.println("\n");
            } 
            System.out.print(RandomLettersNumbers.getRandomIntegers());
        }
        System.out.println("\n");
    }
}
