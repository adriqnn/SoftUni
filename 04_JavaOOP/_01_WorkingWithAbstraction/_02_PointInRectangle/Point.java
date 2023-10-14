package _04_JavaOOP._01_WorkingWithAbstraction._02_PointInRectangle;
public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public boolean isGreaterThanOrEqual(Point p){
        return this.x >= p.x && this.y >= p.y;
    }

    public boolean isLessThanOrEqual(Point p){
        return this.x <= p.x && this.y <= p.y;
    }
}
