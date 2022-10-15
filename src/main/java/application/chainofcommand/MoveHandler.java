package application.chainofcommand;

public class MoveHandler extends Handler implements IHandler{

	IHandler nextHandler;
	
	@Override
	public void setNextHandler(IHandler nextHandler) {
		this.nextHandler = nextHandler;
	}

	@Override
	public void handleRequest(String[] query) {
		if (query[0].equals("MOVE")) {
			super.commands.executeCommand(6, query, canvas, commandHistory);
			//System.out.println("MOVE");
			}
			else {
			nextHandler.handleRequest(query);
			}
	}	

}
