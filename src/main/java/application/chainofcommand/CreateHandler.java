package application.chainofcommand;

public class CreateHandler extends Handler implements IHandler{
	IHandler nextHandler;
	
	@Override
	public void setNextHandler(IHandler nextHandler) {
		this.nextHandler = nextHandler;
	}

	@Override
	public void handleRequest(String[] query) {
		if (query[0].equals("CREATE")) {
			if (query[1].equals("RECTANGLE")) {
				super.commands.executeCommand(2, query, canvas, commandHistory);
			}
			else if (query[1].equals("CIRCLE")) {
				super.commands.executeCommand(1, query, canvas, commandHistory);
			}
			}
			else {
			nextHandler.handleRequest(query);
			}
	}	
}
