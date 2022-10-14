package application.commands;
import application.canvas.Canvas;

public interface Command {

	void execute(String[] query, Canvas canvas);
	
	void undo();
}
