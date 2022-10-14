package application.canvas;
import application.shapes.Shape;
import java.util.ArrayList;

public class Canvas {
    private int currentShape;
    private ArrayList<Shape> shapeList;

    public Canvas() {
        shapeList = new ArrayList<Shape>();
    }

    public void addShape(Shape shape) {
        this.shapeList.add(shape);
    }

    public void deleteShape() {
        if (currentShape != -1 && currentShape < shapeList.size()) {
            this.shapeList.remove(this.currentShape);
        }
    }

    public void setCurrentShape(int currentShape) {
        this.currentShape = currentShape;
    }

    public ArrayList<Shape> getShapes() {
        return shapeList;
    }
}
