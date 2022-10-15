package application.chainofcommand;

import application.commands.CommandHistory;
import application.commands.DrawingCommands;
import application.canvas.Canvas;

public class Handler {
    DrawingCommands commands;
    Canvas canvas;
    CommandHistory commandHistory;

    public void setCommands(DrawingCommands commands) {
        this.commands = commands;
    }

    public void setCanvas(Canvas canvas) {
        this.canvas = canvas;
    }
    
    public void setCommandHistory(CommandHistory commandHistory) {
        this.commandHistory = commandHistory;
    }
}
