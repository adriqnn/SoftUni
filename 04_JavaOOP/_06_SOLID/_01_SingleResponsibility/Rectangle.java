package _04_JavaOOP._06_SOLID._01_SingleResponsibility;

import _04_JavaOOP._06_SOLID._01_SingleResponsibility.interfaces.DrawingRepository;
import _04_JavaOOP._06_SOLID._01_SingleResponsibility.interfaces.Renderer;
import _04_JavaOOP._06_SOLID._01_SingleResponsibility.interfaces.Shape;

public class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return this.height * this.width;
    }

    @Override
    public void draw(Renderer renderer, DrawingRepository drawingRepository) {
        renderer.render(drawingRepository, this);
    }
}
