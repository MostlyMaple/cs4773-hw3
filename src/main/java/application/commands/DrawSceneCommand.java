package application.commands;
import application.canvas.Canvas;
import application.shapes.Shape;

public class DrawSceneCommand implements Command {

	@Override
	public void execute(String[] query, Canvas canvas) {
		for(Shape shape: canvas.getShapes()) {
			System.out.println(shape.toString());
		}
	}

	@Override
	public void undo(Canvas canvas) {
		// TODO Auto-generated method stub

	}

}
