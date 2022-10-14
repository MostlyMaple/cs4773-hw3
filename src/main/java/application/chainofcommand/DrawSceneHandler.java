package application.chainofcommand;

public class DrawSceneHandler extends Handler implements IHandler {
	IHandler nextHandler;
	
	@Override
	public void setNextHandler(IHandler nextHandler) {
		this.nextHandler = nextHandler;
	}

	@Override
	public void handleRequest(String[] query) {
		if (query[0].equals("DRAWSCENE")) {
			//EXECUTE CreateCommand and store state
			System.out.println("DRAWSCENE");
			}
			else {
			nextHandler.handleRequest(query);
			}
	}	

}
