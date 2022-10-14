package application.commands;
import application.canvas.Canvas;

public class DrawCommand implements Command {

	@Override
	public void execute(String[] query, Canvas canvas) {
		int selected = canvas.getCurrentShape();
		if (selected != -1 && selected < canvas.getShapes().size()) {
			System.out.println(canvas.getShapes().get(selected));
		} else {
			System.out.println("no shape selected");
		}
	}

	@Override
	public void undo(Canvas canvas) {
		// TODO Auto-generated method stub

	}

}
