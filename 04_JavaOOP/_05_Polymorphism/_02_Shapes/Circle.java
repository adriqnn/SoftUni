package _04_JavaOOP._05_Polymorphism._02_Shapes;

public class Circle extends Shape{
    private final Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double calculatePerimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public Double calculateArea() {
        return Math.PI * this.radius * this.radius;
    }

    public final Double getRadius() {
        return this.radius;
    }
}
