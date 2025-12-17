
abstract class Shape {
    abstract double calculateArea();

    void displayShape() {
        System.out.println("This is a" + this.getClass().getSimpleName());
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
    return length * width;
    }
}

class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5.0, 10.0);
        rect.displayShape();
        System.out.println("Area: " + rect.calculateArea());
        System.out.println("---");
        Circle circ = new Circle(7.0);
        circ.displayShape();
        System.out.printf("Area: %.2f\n", circ.calculateArea());
    }
}
