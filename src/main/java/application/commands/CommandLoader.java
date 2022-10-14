package application.commands;

public class CommandLoader {

    DrawingCommands drawingCommands = new DrawingCommands();

    public CommandLoader() {
        ColorCommand colorCommand = new ColorCommand();
		CreateCircleCommand createCircleCommand = new CreateCircleCommand();
		CreateRectangleCommand createRectangleCommand = new CreateRectangleCommand();
		DeleteCommand deleteCommand = new DeleteCommand();
		DrawCommand drawCommand = new DrawCommand();
		DrawSceneCommand drawSceneCommand = new DrawSceneCommand();
		MoveCommand moveCommand = new MoveCommand();
		SelectCommand selectCommand = new SelectCommand();
		UndoCommand undoCommand = new UndoCommand();

		drawingCommands.addCommand(colorCommand);
		drawingCommands.addCommand(createCircleCommand);
		drawingCommands.addCommand(createRectangleCommand);
		drawingCommands.addCommand(deleteCommand);
		drawingCommands.addCommand(drawCommand);
		drawingCommands.addCommand(drawSceneCommand);
		drawingCommands.addCommand(moveCommand);
		drawingCommands.addCommand(selectCommand);
		drawingCommands.addCommand(undoCommand);
    }

    public DrawingCommands getDrawingCommands() {
        return this.drawingCommands;
    }
}
