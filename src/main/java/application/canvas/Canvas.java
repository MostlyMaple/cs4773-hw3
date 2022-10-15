package application.canvas;
import application.shapes.Shape;
import java.util.ArrayList;

public class Canvas {
    private int currentShape;
    private ArrayList<Shape> shapeList;
    private String outputString = "";
    
    public Canvas() {
    	this.currentShape = -1;
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
    
    public int getCurrentShape() {
        return this.currentShape;
    }

    public ArrayList<Shape> getShapes() {
        return this.shapeList;
    }

	public String getOutputString() {
		return outputString;
	}

	public void setOutputString(String outputString) {
		this.outputString = outputString;
	}
}
