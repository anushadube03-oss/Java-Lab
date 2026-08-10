import java.util.Scanner;

// Parent class
class Shape {
    void calculateArea() {
        System.out.println("Area of shape");
    }
}

// Circle class
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle = " + area);
    }
}

// Rectangle class
class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void calculateArea() {
        double area = length * width;
        System.out.println("Area of Rectangle = " + area);
    }
}

// Main class
public class ShapeDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Circle
        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();

        Circle circle = new Circle(radius);
        circle.calculateArea();

        // Rectangle
        System.out.print("Enter length of rectangle: ");
        double length = sc.nextDouble();

        System.out.print("Enter width of rectangle: ");
        double width = sc.nextDouble();

        Rectangle rectangle = new Rectangle(length, width);
        rectangle.calculateArea();

        sc.close();
    }
}