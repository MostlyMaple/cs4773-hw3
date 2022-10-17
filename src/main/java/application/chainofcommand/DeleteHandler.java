package application.chainofcommand;

public class DeleteHandler extends Handler implements IHandler {
	IHandler nextHandler;
	
	@Override
	public void setNextHandler(IHandler nextHandler) {
		this.nextHandler = nextHandler;
	}

	@Override
	public void handleRequest(String[] query) {
		if (query[0].equals("DELETE")) {
			super.commands.executeCommand(3, query, canvas, commandHistory);
			}
			else {
			nextHandler.handleRequest(query);
			}
	}	
}
