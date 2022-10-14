package application.chainofcommand;

public class UndoHandler implements Handler {
	Handler nextHandler;
	
	@Override
	public void setNextHandler(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}

	@Override
	public void handleRequest(String query) {
		if (query.equals("UNDO")) {
			//EXECUTE CreateCommand and store state
			System.out.println("UNDO");
			}
			else {
			nextHandler.handleRequest(query);
			}
	}	

}
