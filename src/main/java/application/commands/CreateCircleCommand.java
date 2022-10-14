package application.commands;
import application.canvas.Canvas;
import application.shapes.Color;
import application.shapes.Origin;
import application.shapes.Circle;

public class CreateCircleCommand implements Command {

	@Override
	public void execute(String[] query, Canvas canvas) {
		Origin origin = new Origin(0,0);
		int radius = 0;
		try {
			radius = Integer.parseInt(query[2]);
			Circle circle = new Circle(Color.Blue, origin, radius);
			canvas.addShape(circle);
			System.out.println(circle.toString());
		}
		catch (Exception e) {
			e.printStackTrace();
			System.exit(-1);
		}
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}

}
