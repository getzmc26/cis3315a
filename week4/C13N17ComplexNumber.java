package week4;

/**
 * Class to work with complex numbers.
 *
 * @author Matt Getz
 */
public class C13N17ComplexNumber {

    public static void main(String[] args) throws CloneNotSupportedException {
        Complex c1 = new Complex(3.5, 5.5);
        Complex c2 = (Complex)c1.clone();
        System.out.println("\nc1 = " + c1);
        System.out.println("\nc2 = " + c2);
        c2.setA(5.5);
        c2.setB(8.5);
        System.out.println("\nc1 = " + c1);
        System.out.println("\nc2 = " + c2);
        System.out.println("\nc2 - c1 = " + c2.subtract(c1));
        
    }
}

class Complex implements Cloneable {

    //a + bi
    private double a; //real part
    private double b; // imaginary part

    public Complex(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public Complex add(Complex c) {
        return new Complex((a + c.getA()), (b + c.getB()));
    }

    public Complex subtract(Complex c) {
        return new Complex((a - c.getA()), (b - c.getB()));
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Complex{" + "a=" + a + ", b=" + b + '}';
    }
}
