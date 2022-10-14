package application.commands;
import application.canvas.Canvas;

public class DeleteCommand implements Command{

	@Override
	public void execute(String[] query, Canvas canvas) {
		int selected = canvas.getCurrentShape();
		if (selected != -1 && selected < canvas.getShapes().size()) {
			canvas.getShapes().remove(selected);
		} else {
			System.out.println("no shape selected");
		}
		canvas.setCurrentShape(-1);
	}

	@Override
	public void undo(Canvas canvas) {
		// TODO Auto-generated method stub
		
	}

}
