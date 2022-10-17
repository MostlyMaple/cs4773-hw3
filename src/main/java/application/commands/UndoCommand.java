package application.commands;
import application.canvas.Canvas;

public class UndoCommand implements Command {

	@Override
	public void execute(String[] query, Canvas canvas, CommandHistory commandHistory) {
		Command command = commandHistory.getRecentCommand();
		if (command != null) { 
			command.undo(canvas);
		} else {
			System.out.println("Nothing left to undo!");
		}
	}

	public void undo(Canvas canvas) {
		
	}

}
