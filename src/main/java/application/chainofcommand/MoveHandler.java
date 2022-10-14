package application.chainofcommand;

public class MoveHandler implements Handler{

	Handler nextHandler;
	
	@Override
	public void setNextHandler(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}

	@Override
	public void handleRequest(String query) {
		if (query.equals("MOVE")) {
			//EXECUTE CreateCommand and store state
			System.out.println("MOVE");
			}
			else {
			nextHandler.handleRequest(query);
			}
	}	

}
