import java.util.Date;
import java.util.Scanner;

class GeometricObjects {
    String color = "White";
    boolean filled;
    Date dateCreated = new Date();

    GeometricObjects() {
        // Default constructor
    }

    GeometricObjects(String color, boolean filled) {
        // Parameterized constructor
        this.color = color;
        this.filled = filled;

    }

    // get color method
    public String getColor() {
        return color;
    }

    // set color method
    public void setColor(String color) {
        this.color = color;
    }

    // get boolean method //type and return type in getter
    public boolean isfilled() {
        return filled;
    }

    public void setfilled(boolean filled) { // void and parameter in setter
        this.filled = filled;
    }
}

// PART B CODE
class Rectangle extends GeometricObjects {
    double width = 2.0;
    double height = 1.0;

    Rectangle() {
        // No-argument constructor
    }

    // Constructor with 2 params
    Rectangle(double width, double height) {
        this.height = height;
        this.width = width;
    }

    // Constructor with all 4 params
    Rectangle(double width, double height, String color, boolean filled) {
        this.height = height;
        this.width = width;
        setColor(color);
        setfilled(filled);
    }

    // Accessor method (getters) 'return' and 'type' of variable
    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
    // color or boolean k getters Geometricobjs mein bane hoi phle se

    // GetArea method
    public double getArea() {
        return width * height;
    }

    // GetPerimeter method
    public double getPerimeter() {
        return 2 * (width + height);
    }

    // toString method
    public String toString() {
        return("Rectangle: width = " + width + " height = " + height);
    }
}

// part c
public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //user prompt
        System.out.println("enter width, height, color, boolean");
        double width = sc.nextDouble();
        double height = sc.nextDouble();
        String color = sc.next();
        boolean filled = sc.nextBoolean();
        
//      System.out.println("enter width, height, color, boolean");
        Rectangle obj = new Rectangle(width,height, color, filled);
        
        System.out.println(obj.getArea());
        System.out.println(obj.getPerimeter());
        System.out.println(obj.getColor());
        System.out.println(obj.isfilled());
        // System.out.println("Area= "+ obj.getArea() + " Perimeter= " + obj.getPerimeter() + "Color= " + obj.getColor() + "Boolean value= " + obj.isfilled());
    }
}
