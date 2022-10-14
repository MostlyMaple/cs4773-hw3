package application.chainofcommand;

public interface Handler {
	public void setNextHandler(Handler nextHandler);
	public void handleRequest(String query);
}


