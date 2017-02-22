package week4;

/**
 *
 * @author Matt Getz
 */
public abstract class C11Pet {
    private String name;
    
    public abstract String speak();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
