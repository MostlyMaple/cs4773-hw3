package application.chainofcommand;
import application.commands.*;
import java.util.ArrayList;
import application.canvas.Canvas;

public class HandlerChain {
	private IHandler firstHandler;
	private ArrayList<Handler> handlers = new ArrayList<Handler>();

	public HandlerChain(Canvas canvas, CommandLoader commandLoader) {

		ColorHandler colorHandler = new ColorHandler();
		CreateHandler createHandler = new CreateHandler();
		DeleteHandler deleteHandler = new DeleteHandler();
		DrawHandler drawHandler = new DrawHandler();
		DrawSceneHandler drawSceneHandler = new DrawSceneHandler();
		MoveHandler moveHandler = new MoveHandler();
		SelectHandler selectHandler = new SelectHandler();
		UndoHandler undoHandler = new UndoHandler();
		
		addHandler(colorHandler);
		addHandler(createHandler);
		addHandler(deleteHandler);
		addHandler(drawHandler);
		addHandler(drawSceneHandler);
		addHandler(moveHandler);
		addHandler(selectHandler);
		addHandler(undoHandler);


		for (int i = 0; i < handlers.size(); i++) {
			handlers.get(i).setCommands(commandLoader.getDrawingCommands());
			handlers.get(i).setCanvas(canvas);
		}

		colorHandler.setNextHandler(createHandler);
		createHandler.setNextHandler(deleteHandler);
		deleteHandler.setNextHandler(drawHandler);
		drawHandler.setNextHandler(drawSceneHandler);
		drawSceneHandler.setNextHandler(moveHandler);
		moveHandler.setNextHandler(selectHandler);
		selectHandler.setNextHandler(undoHandler);

		firstHandler = colorHandler;
	}
	
	public void handleRequest(String[] query) {
		firstHandler.handleRequest(query);
	}

	public void addHandler(Handler handler) {
		this.handlers.add(handler);
	}
	
}
