package application.commands;

import java.util.ArrayList;
import application.canvas.Canvas;

public class DrawingCommands {
    
    ArrayList<Command> commands = new ArrayList<Command>();

    public void executeCommand(int commandIndex, String[] query, Canvas canvas, CommandHistory commandHistory) {
        commands.get(commandIndex).execute(query, canvas, commandHistory);
    }

    public void addCommand(Command command) {
        this.commands.add(command);
    }
}
