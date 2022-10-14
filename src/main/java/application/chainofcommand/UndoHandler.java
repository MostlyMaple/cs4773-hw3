package application.chainofcommand;

public class UndoHandler extends Handler implements IHandler {
	IHandler nextHandler;
	
	@Override
	public void setNextHandler(IHandler nextHandler) {
		this.nextHandler = nextHandler;
	}

	@Override
	public void handleRequest(String[] query) {
		if (query[0].equals("UNDO")) {
			//EXECUTE CreateCommand and store state
			System.out.println("UNDO");
			}
			else {
			nextHandler.handleRequest(query);
			}
	}	

}
