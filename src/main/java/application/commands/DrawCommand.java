package application.commands;
import application.canvas.Canvas;
import application.shapes.Color;
import application.shapes.Origin;
import application.shapes.Rectangle;
import application.shapes.Shape;

public class DrawCommand implements Command {

	@Override
	public void execute(String[] query, Canvas canvas) {
		int selected = canvas.getCurrentShape();
		if (selected != -1 && selected < canvas.getShapes().size()) {
			System.out.println(canvas.getShapes().get(selected));
		}
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub

	}

}
