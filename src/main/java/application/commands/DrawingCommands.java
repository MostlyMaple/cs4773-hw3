package application.commands;

import java.util.ArrayList;
import application.canvas.Canvas;

public class DrawingCommands {
    
    ArrayList<Command> commands = new ArrayList<Command>();

    public void executeCommand(int commandIndex, String[] query, Canvas canvas) {
        commands.get(commandIndex).execute(query, canvas);
    }

    public void addCommand(Command command) {
        this.commands.add(command);
    }
}
