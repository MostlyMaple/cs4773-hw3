package application.chainofcommand;

public class DrawSceneHandler implements Handler {
	Handler nextHandler;
	
	@Override
	public void setNextHandler(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}

	@Override
	public void handleRequest(String query) {
		if (query.equals("DRAWSCENE")) {
			//EXECUTE CreateCommand and store state
			System.out.println("DRAWSCENE");
			}
			else {
			nextHandler.handleRequest(query);
			}
	}	

}
