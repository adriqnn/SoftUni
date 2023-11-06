package _04_JavaOOP._11_DesignPatternsExercise._01_Factory;

public class ShapeFactory {
    public Shape createShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }

        if (shapeType.equalsIgnoreCase("Circle")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        }

        return null;
    }
}
