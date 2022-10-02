package _04_JavaOOP._05_Polymorphism._02_Shapes;

public class Rectangle extends Shape{
    private final Double width;
    private final Double height;

    public Rectangle(Double width, Double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public Double calculatePerimeter() {
        return this.width*2 + this.height*2;
    }

    @Override
    public Double calculateArea() {
        return this.width*this.height;
    }

    public final Double getWidth() {
        return width;
    }

    public final Double getHeight() {
        return height;
    }
}
