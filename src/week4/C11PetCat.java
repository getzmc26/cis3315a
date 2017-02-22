package week4;

/**
 *
 * @author Matt Getz
 */
public class C11PetCat extends C11Pet {

    @Override
    public String speak() {
        return " says meow.";
    }
    
    @Override
    public String toString() {
        return "My name is " + getName() + " and I am a cat.";
    }
}
