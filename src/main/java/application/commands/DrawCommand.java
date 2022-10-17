package application.commands;
import application.canvas.Canvas;

public class DrawCommand implements Command {

	@Override
	public void execute(String[] query, Canvas canvas, CommandHistory commandHistory) {
		int selected = canvas.getCurrentShape();
		if (selected != -1 && selected < canvas.getShapes().size()) {
			String output = canvas.getShapes().get(selected).toString();
			canvas.setOutputString(canvas.getOutputString() + output + '\n');
			System.out.println(output);
		} else {
			String output = "no shape selected";
			canvas.setOutputString(canvas.getOutputString() + output + '\n');
			System.out.println(output);
		}
	}

	@Override
	public void undo(Canvas canvas) {
	}

}
