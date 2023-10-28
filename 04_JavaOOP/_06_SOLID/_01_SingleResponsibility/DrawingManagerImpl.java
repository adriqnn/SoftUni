package _04_JavaOOP._06_SOLID._01_SingleResponsibility;

import _04_JavaOOP._06_SOLID._01_SingleResponsibility.interfaces.DrawingManager;
import _04_JavaOOP._06_SOLID._01_SingleResponsibility.interfaces.DrawingRepository;
import _04_JavaOOP._06_SOLID._01_SingleResponsibility.interfaces.Renderer;
import _04_JavaOOP._06_SOLID._01_SingleResponsibility.interfaces.Shape;

public class DrawingManagerImpl implements DrawingManager {
    private final DrawingRepository drawingRepository;
    private final Renderer renderer;

    public DrawingManagerImpl(DrawingRepository drawingRepository, Renderer renderer) {
        this.drawingRepository = drawingRepository;
        this.renderer = renderer;
    }

    @Override
    public void draw(Shape shape) {
        shape.draw(this.renderer, this.drawingRepository);
    }
}
