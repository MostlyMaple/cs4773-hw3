package application.chainofcommand;

public class DrawHandler extends Handler implements IHandler {
	IHandler nextHandler;
	
	@Override
	public void setNextHandler(IHandler nextHandler) {
		this.nextHandler = nextHandler;
	}

	@Override
	public void handleRequest(String[] query) {
		if (query[0].equals("DRAW")) {
			//EXECUTE CreateCommand and store state
			System.out.println("DRAW");
			}
			else {
			nextHandler.handleRequest(query);
			}
	}	

}
