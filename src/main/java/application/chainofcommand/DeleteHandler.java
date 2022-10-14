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
			//EXECUTE CreateCommand and store state
			System.out.println("DELETE");
			}
			else {
			nextHandler.handleRequest(query);
			}
	}	
}
