public abstract class Shape 
{
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}


class Circle extends Shape 
{
    private double radius;

    public Circle(double radius) 
{
        this.radius = radius;
    }

    // Implementing abstract methods
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Triangle class, a subclass of Shape
class Triangle extends Shape {
    private double side1, side2, side3;

    // Constructor
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Implementing abstract methods
    public double calculateArea() {
        // Using Heron's formula to calculate the area of a triangle
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}

// Main class to demonstrate polymorphism and calculation of area and perimeter
class Main {
    public static void main(String[] args) {
        // Creating objects of Circle and Triangle
        Circle circle = new Circle(5.0);
        Triangle triangle = new Triangle(3.0, 4.0, 5.0);

        // Displaying area and perimeter of the Circle
        System.out.println("Circle - Area: " + circle.calculateArea());
        System.out.println("Circle - Perimeter: " + circle.calculatePerimeter());

        // Displaying area and perimeter of the Triangle
        System.out.println("Triangle - Area: " + triangle.calculateArea());
        System.out.println("Triangle - Perimeter: " + triangle.calculatePerimeter());
    }
}

