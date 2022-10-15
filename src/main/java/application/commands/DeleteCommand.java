package application.commands;
import application.canvas.Canvas;
import application.shapes.Shape;

public class DeleteCommand implements Command{
	Shape deletedShape;
	int selectedShape;
	
	@Override
	public void execute(String[] query, Canvas canvas, CommandHistory commandHistory) {
		int selected = canvas.getCurrentShape();
		if (selected != -1 && selected < canvas.getShapes().size()) {
			deletedShape = canvas.getShapes().remove(selected);
			selectedShape = selected;
			commandHistory.addToCommandHistory(this);
		} else {
			System.out.println("no shape selected");
		}
		canvas.setCurrentShape(-1);
	}

	@Override
	public void undo(Canvas canvas, CommandHistory commandHistory) {
			canvas.getShapes().add(selectedShape, deletedShape);
	}

}
