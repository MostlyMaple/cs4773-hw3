package application.chainofcommand;

public class DeleteHandler implements Handler {
	Handler nextHandler;
	
	@Override
	public void setNextHandler(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}

	@Override
	public void handleRequest(String query) {
		if (query.equals("DELETE")) {
			//EXECUTE CreateCommand and store state
			System.out.println("DELETE");
			}
			else {
			nextHandler.handleRequest(query);
			}
	}	
}
