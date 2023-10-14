package _04_JavaOOP._01_WorkingWithAbstraction._02_PointInRectangle;

public class Rectangle {
    private final Point pointA;
    private final Point pointB;

    public Rectangle(Point pointA, Point pointB){
        this.pointA = pointA;
        this.pointB = pointB;
    }

    public boolean contains(Point p){
        return p.isGreaterThanOrEqual(this.pointA) && p.isLessThanOrEqual(this.pointB);
    }
}
