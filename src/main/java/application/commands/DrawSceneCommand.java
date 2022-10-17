package application.commands;
import application.canvas.Canvas;
import application.shapes.Shape;

public class DrawSceneCommand implements Command {

	@Override
	public void execute(String[] query, Canvas canvas, CommandHistory commandHistory) {
		for(Shape shape: canvas.getShapes()) {
			String output = shape.toString();
			canvas.setOutputString(canvas.getOutputString() + output + '\n');
			System.out.println(output);
		}
	}

	@Override
	public void undo(Canvas canvas) {
	}

}
