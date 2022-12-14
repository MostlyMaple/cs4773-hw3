package application.commands;

import java.util.Stack;

public class CommandHistory {
	Stack<Command> commandHistory = new Stack<Command>();
	
	public CommandHistory() {
		
	}
	
	public void addToCommandHistory(Command command) {
		commandHistory.push(command);
	}
	
	public Command getRecentCommand() {
		if (commandHistory.size() > 0) {
			return commandHistory.pop();
		} else {
			return null;
		}
	}
	
}
