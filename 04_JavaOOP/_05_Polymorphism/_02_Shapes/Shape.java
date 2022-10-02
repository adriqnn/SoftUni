package _04_JavaOOP._05_Polymorphism._02_Shapes;

public abstract class Shape {
    protected Double perimeter;
    protected Double area;

    public abstract Double calculatePerimeter();
    public abstract Double calculateArea();

    public Double getArea() {
        return area;
    }

    public Double getPerimeter() {
        return perimeter;
    }
}
