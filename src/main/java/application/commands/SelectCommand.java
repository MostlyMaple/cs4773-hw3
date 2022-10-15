package application.commands;
import application.canvas.Canvas;

public class SelectCommand implements Command {

	@Override
	public void execute(String[] query, Canvas canvas, CommandHistory commandHistory) {
		int selected = -1;
		try {
			selected = Integer.parseInt(query[1]);
			if ((selected-1) >= 0 && (selected-1) < canvas.getShapes().size()) {
				canvas.setCurrentShape(selected - 1);
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
	public void undo(Canvas canvas, CommandHistory commandHistory) {
		// TODO Auto-generated method stub

	}

}
