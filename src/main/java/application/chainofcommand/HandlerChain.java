package application.chainofcommand;

public class HandlerChain {
	Handler firstHandler;
	
	public HandlerChain() {
		ColorHandler colorHandler = new ColorHandler();
		CreateHandler createHandler = new CreateHandler();
		DeleteHandler deleteHandler = new DeleteHandler();
		DrawHandler drawHandler = new DrawHandler();
		DrawSceneHandler drawSceneHandler = new DrawSceneHandler();
		MoveHandler moveHandler = new MoveHandler();
		SelectHandler selectHandler = new SelectHandler();
		UndoHandler undoHandler = new UndoHandler();
		
		colorHandler.setNextHandler(createHandler);
		createHandler.setNextHandler(deleteHandler);
		deleteHandler.setNextHandler(drawHandler);
		drawHandler.setNextHandler(drawSceneHandler);
		drawSceneHandler.setNextHandler(moveHandler);
		moveHandler.setNextHandler(selectHandler);
		selectHandler.setNextHandler(undoHandler);
		
		firstHandler = colorHandler;
	}
	
	public void handleRequest(String query) {
		firstHandler.handleRequest(query);
	}
	
}
