package application.commands;
import application.canvas.Canvas;

import application.shapes.Origin;

public class MoveCommand implements Command{
	Origin prevOrigin;
	int prevSelected;
	
	@Override
	public void execute(String[] query, Canvas canvas, CommandHistory commandHistory) {
		int selected = canvas.getCurrentShape();
		int x = 0;
		int y = 0;
		try {
			x = Integer.parseInt(query[1]);
			y = Integer.parseInt(query[2]);
			Origin origin = new Origin(x,y);
			if (selected != -1 && selected < canvas.getShapes().size()) {
				prevSelected = selected;
				prevOrigin = canvas.getShapes().get(selected).getOrigin();
				canvas.getShapes().get(selected).setOrigin(origin);
				commandHistory.addToCommandHistory(this);
			}  else {
				System.out.println("no shape selected");
			}
		}
		catch (Exception e) {
			e.printStackTrace();
			System.exit(-1);
		}
	}

	@Override
	public void undo(Canvas canvas, CommandHistory commandHistory) {
		canvas.getShapes().get(prevSelected).setOrigin(prevOrigin);
	}

}
