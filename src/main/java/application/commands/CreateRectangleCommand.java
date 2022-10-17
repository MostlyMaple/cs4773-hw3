package application.commands;

import application.shapes.Color;
import application.shapes.Origin;
import application.shapes.Rectangle;
import application.canvas.Canvas;

public class CreateRectangleCommand implements Command{
	Rectangle newRectangle;
	
	public CreateRectangleCommand () {

	}

	public CreateRectangleCommand(Rectangle newRectangle) {
		this.newRectangle = newRectangle;
	}

	@Override
	public void execute(String[] query, Canvas canvas, CommandHistory commandHistory) {
		Origin origin = new Origin(0,0);
		int width = 0;
		int height = 0;
		try {
			width = Integer.parseInt(query[2]);
			height = Integer.parseInt(query[3]);
			Rectangle rectangle = new Rectangle(Color.Red, origin, height, width);
			newRectangle = rectangle;
			CreateRectangleCommand duplicate = new CreateRectangleCommand(this.newRectangle);
			canvas.addShape(rectangle);
			commandHistory.addToCommandHistory(duplicate);
			//System.out.println(rectangle.toString());
		}
		catch (Exception e) {
			e.printStackTrace();
			System.exit(-1);
		}
	}

	@Override
	public void undo(Canvas canvas, CommandHistory commandHistory) {
		canvas.getShapes().remove(newRectangle);
	}

}
