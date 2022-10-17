package application.commands;
import application.canvas.Canvas;

public class SelectCommand implements Command {

	int prevSelected;

	public SelectCommand () {

	}

	public SelectCommand (int prevSelected) {
		this.prevSelected = prevSelected;
	}

	@Override
	public void execute(String[] query, Canvas canvas, CommandHistory commandHistory) {
		int selected;
		try {
			selected = Integer.parseInt(query[1]);
			if ((selected-1) >= 0 && (selected-1) < canvas.getShapes().size()) {
				prevSelected = canvas.getCurrentShape();
				canvas.setCurrentShape(selected - 1);
				SelectCommand duplicate = new SelectCommand(this.prevSelected);
				commandHistory.addToCommandHistory(duplicate);
				//System.out.println("Selected: " + (selected));
			} else {
				String output = "ERROR: invalid shape for SELECT";
				canvas.setOutputString(canvas.getOutputString() + output + '\n');
				System.out.println(output);
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
			System.exit(-1);
		}
	}

	@Override
	public void undo(Canvas canvas) {
		canvas.setCurrentShape(this.prevSelected);
	}

}
