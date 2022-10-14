package application.chainofcommand;

public class DrawHandler implements Handler {
	Handler nextHandler;
	
	@Override
	public void setNextHandler(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}

	@Override
	public void handleRequest(String query) {
		if (query.equals("DRAW")) {
			//EXECUTE CreateCommand and store state
			System.out.println("DRAW");
			}
			else {
			nextHandler.handleRequest(query);
			}
	}	

}
