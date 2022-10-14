package application.commands;
import application.canvas.Canvas;
import application.shapes.Color;

public class ColorCommand implements Command {

	@Override
	public void execute(String[] query, Canvas canvas) {
		int selected = canvas.getCurrentShape();
		Color color;
		try {
			color = Color.valueOf(query[1]);
			if (selected != -1 && selected < canvas.getShapes().size()) {
				canvas.getShapes().get(selected).setColor(color);
			} else {
				System.out.println("no shape selected");
			}
		}
		catch (Exception e) {
			e.printStackTrace();
			System.exit(-1);
		}
	}

	@Override
	public void undo(Canvas canvas) {
		// TODO Auto-generated method stub

	}

}
