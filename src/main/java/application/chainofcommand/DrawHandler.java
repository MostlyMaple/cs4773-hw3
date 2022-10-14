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
			super.commands.executeCommand(4, query, canvas);
			System.out.println("DRAW");
			}
			else {
			nextHandler.handleRequest(query);
			}
	}	

}
