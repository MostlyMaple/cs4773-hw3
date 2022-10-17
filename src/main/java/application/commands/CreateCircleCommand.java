package application.commands;
import application.canvas.Canvas;
import application.shapes.Color;
import application.shapes.Origin;
import application.shapes.Circle;

public class CreateCircleCommand implements Command {
	Circle newCircle;

	public CreateCircleCommand() {

	}

	public CreateCircleCommand(Circle newCircle) {
		this.newCircle = newCircle;
	}
	
	@Override
	public void execute(String[] query, Canvas canvas, CommandHistory commandHistory) {
		Origin origin = new Origin(0,0);
		int radius = 0;
		try {
			radius = Integer.parseInt(query[2]);
			Circle circle = new Circle(Color.Blue, origin, radius);
			newCircle = circle;
			canvas.addShape(circle);
			CreateCircleCommand duplicate = new CreateCircleCommand(newCircle);
			commandHistory.addToCommandHistory(duplicate);
			//System.out.println(circle.toString());
		}
		catch (Exception e) {
			e.printStackTrace();
			System.exit(-1);
		}
	}

	@Override
	public void undo(Canvas canvas, CommandHistory commandHistory) {
		canvas.getShapes().remove(newCircle);
	}

}
