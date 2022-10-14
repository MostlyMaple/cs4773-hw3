package application.commands;
import application.canvas.Canvas;
import application.shapes.Circle;
import application.shapes.Color;
import application.shapes.Origin;

public class SelectCommand implements Command {

	@Override
	public void execute(String[] query, Canvas canvas) {
		int selected = -1;
		try {
			selected = Integer.parseInt(query[1]);
			if (selected < canvas.getShapes().size()) {
				canvas.setCurrentShape(selected - 1);
				System.out.println("Selected: " + (selected - 1));
			} else {
				System.out.println("ERROR: invalid shape for SELECT");
			}
			
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
