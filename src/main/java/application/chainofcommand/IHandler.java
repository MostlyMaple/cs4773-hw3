package application.chainofcommand;

public interface IHandler {
	public void setNextHandler(IHandler nextHandler);
	public void handleRequest(String[] query);
}


