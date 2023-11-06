package _04_JavaOOP._11_DesignPatternsExercise._01_Factory;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // Create a Circle
        Shape circle = shapeFactory.createShape("Circle");
        circle.draw();

        // Create a Rectangle
        Shape rectangle = shapeFactory.createShape("Rectangle");
        rectangle.draw();
    }
}
