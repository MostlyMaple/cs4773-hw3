package application.commands;
import application.canvas.Canvas;
import application.shapes.Color;

public class ColorCommand implements Command {
	Color prevColor;
	int prevSelected;

	public ColorCommand () {

	}

	public ColorCommand (Color prevColor, int prevSelected) {
		this.prevColor = prevColor;
		this.prevSelected = prevSelected;
	}

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
				ColorCommand duplicate = new ColorCommand(this.prevColor, this.prevSelected);
				commandHistory.addToCommandHistory(duplicate);
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
		canvas.getShapes().get(prevSelected).setColor(prevColor);
	}

}
