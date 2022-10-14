package application.chainofcommand;

public class CreateHandler implements Handler{
	Handler nextHandler;
	
	@Override
	public void setNextHandler(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}

	@Override
	public void handleRequest(String query) {
		if (query.equals("CREATE")) {
			//EXECUTE CreateCommand and store state
			System.out.println("CREATE");
			}
			else {
			nextHandler.handleRequest(query);
			}
	}	
}
