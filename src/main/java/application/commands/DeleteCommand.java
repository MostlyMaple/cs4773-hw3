package application.commands;
import application.canvas.Canvas;
import application.shapes.Shape;

public class DeleteCommand implements Command{
	Shape deletedShape;
	int selectedShape;
	
	public DeleteCommand() {

	}

	public DeleteCommand(Shape deletedShape, int selectedShape) {
		this.deletedShape = deletedShape;
		this.selectedShape = selectedShape;
	}

	@Override
	public void execute(String[] query, Canvas canvas, CommandHistory commandHistory) {
		int selected = canvas.getCurrentShape();
		if (selected != -1 && selected < canvas.getShapes().size()) {
			deletedShape = canvas.getShapes().remove(selected);
			selectedShape = selected;
			DeleteCommand duplicate = new DeleteCommand(deletedShape, selectedShape);
			commandHistory.addToCommandHistory(duplicate);
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
