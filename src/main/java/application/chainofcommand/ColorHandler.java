package application.chainofcommand;

public class ColorHandler implements Handler {
	Handler nextHandler;
	
	public void setNextHandler(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}

	public void handleRequest(String query) {
		if (query.equals("COLOR")) {
			//EXECUTE ColorCommand and store state
			System.out.println("COLOR");
			}
			else {
			nextHandler.handleRequest(query);
			}
	}	

}
