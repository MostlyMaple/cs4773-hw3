package application.chainofcommand;

public class ColorHandler extends Handler implements IHandler {
	IHandler nextHandler;
	
	public void setNextHandler(IHandler nextHandler) {
		this.nextHandler = nextHandler;
	}

	public void handleRequest(String[] query) {
		if (query[0].equals("COLOR")) {
			super.commands.executeCommand(0, query, canvas);
			System.out.println("COLOR");
			}
			else {
			nextHandler.handleRequest(query);
			}
	}	

}
