package week4;

/**
 *
 * @author Matt Getz
 */
public class C11PetDog extends C11Pet {

    @Override
    public String speak() {
        return " says ruff ruff.";
    }
    
    @Override
    public String toString() {
        return "My name is " + getName() + " and I am a dog.";
    }
            
}
