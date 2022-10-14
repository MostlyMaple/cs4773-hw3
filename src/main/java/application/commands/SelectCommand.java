package application.commands;
import application.canvas.Canvas;

public class SelectCommand implements Command {

	@Override
	public void execute(String[] query, Canvas canvas) {
		int selected = -1;
		try {
			selected = Integer.parseInt(query[1]);
			if ((selected-1) >= 0 && (selected-1) < canvas.getShapes().size()) {
				canvas.setCurrentShape(selected - 1);
				System.out.println("Selected: " + (selected));
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
	public void undo(Canvas canvas) {
		// TODO Auto-generated method stub

	}

}
