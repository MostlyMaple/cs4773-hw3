package application.chainofcommand;

public class SelectHandler extends Handler implements IHandler{
	IHandler nextHandler;
	
	@Override
	public void setNextHandler(IHandler nextHandler) {
		this.nextHandler = nextHandler;
	}

	@Override
	public void handleRequest(String[] query) {
		if (query[0].equals("SELECT")) {
			super.commands.executeCommand(7, query, canvas, commandHistory);
			}
			else {
			nextHandler.handleRequest(query);
			}
	}	
}
