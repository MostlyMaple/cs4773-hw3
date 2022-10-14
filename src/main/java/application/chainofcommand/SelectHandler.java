package application.chainofcommand;

public class SelectHandler implements Handler{
	Handler nextHandler;
	
	@Override
	public void setNextHandler(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}

	@Override
	public void handleRequest(String query) {
		if (query.equals("SELECT")) {
			//EXECUTE CreateCommand and store state
			System.out.println("SELECT");
			}
			else {
			nextHandler.handleRequest(query);
			}
	}	
}
