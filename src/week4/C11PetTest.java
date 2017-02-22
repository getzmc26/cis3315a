package week4;

/**
 *
 * @author Matt Getz
 */
public class C11PetTest {
    public static void main(String[] args) {
        C11Pet pc1 = new C11PetCat();
        pc1.setName("Mittens");
        C11Pet pd1 = new C11PetDog();
        pd1.setName("Doggo");
        
        System.out.println(pc1);
        System.out.println(pd1);

    }
}
