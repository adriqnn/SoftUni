package _04_JavaOOP._06_SOLID._03_LiskovSubstitution;

public class Main {
    public static void main(String[] args) {
        // Liskov Substitution example
        
        // Create instances of different shapes
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);
        Shape square = new Square(4.0);

        // Calculate and display their areas
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Square Area: " + square.calculateArea());
    }
}
