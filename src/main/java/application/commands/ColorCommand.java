package application.commands;
import application.canvas.Canvas;
import application.shapes.Color;

public class ColorCommand implements Command {
	Color prevColor;
	int prevSelected;
	@Override
	public void execute(String[] query, Canvas canvas, CommandHistory commandHistory) {
		int selected = canvas.getCurrentShape();
		Color color;
		try {
			color = Color.valueOf(query[1]);
			if (selected != -1 && selected < canvas.getShapes().size()) {
				prevSelected = selected;
				prevColor = canvas.getShapes().get(selected).getColor();
				canvas.getShapes().get(selected).setColor(color);
				commandHistory.addToCommandHistory(this);
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
	public void undo(Canvas canvas, CommandHistory commandHistory) {
		canvas.getShapes().get(prevSelected).setColor(prevColor);
	}

}
