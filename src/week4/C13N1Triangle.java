package week4;

import java.text.DecimalFormat;
import java.util.Date;

/**
 * Make a triangle class that extends the abstract GeometricObject class. The
 * Triangle object should pass in the three sides of the triangle. Each object
 * should print area, perimeter, color, and whether or not it is filled in.
 *
 * @author Matt Getz
 */
public class C13N1Triangle {

    public static void main(String[] args) {
        Triangle t1 = new Triangle(3, 4, 5, "Blue", true);
        Triangle t2 = new Triangle(7, 8, 9, "Red", false);
        System.out.println(t1);
        System.out.println(t2);
    }
}

abstract class GeometricObject {

    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    protected GeometricObject() {
        dateCreated = new Date();
    }

    public GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(java.util.Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public String toString() {
        return "Color = " + color
                + "\nFilled = " + filled
                + "\nDate = " + dateCreated
                + "\n";
    }

    public abstract String getArea();

    public abstract String getPerimeter();
}

class Triangle extends GeometricObject {

    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c, String color, boolean filled) {
        super(color, filled);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String getArea() {
        DecimalFormat df = new DecimalFormat("#.00");
        double p = (a + b + c) / 2;
        double pCalc = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        String pCalcFormatted = df.format(pCalc);
        return pCalcFormatted;
    }

    @Override
    public String getPerimeter() {
        DecimalFormat df = new DecimalFormat("#.00");
        double perim = a + b + c;
        String perimFormatted = df.format(perim);
        return perimFormatted;
    }

    public String toString() {
        return "Area = " + getArea()
                + "\nPerimeter = " + getPerimeter()
                + "\n" + super.toString();
    }
}
