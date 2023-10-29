package _04_JavaOOP._06_SOLID._03_LiskovSubstitution;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public Circle setRadius(double radius) {
        this.radius = radius;
        return this;
    }

    @Override
    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }
}
