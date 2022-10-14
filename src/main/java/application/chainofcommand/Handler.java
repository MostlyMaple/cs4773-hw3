package application.chainofcommand;

import application.commands.DrawingCommands;
import application.canvas.Canvas;

public class Handler {
    DrawingCommands commands;
    Canvas canvas;

    public void setCommands(DrawingCommands commands) {
        this.commands = commands;
    }

    public void setCanvas(Canvas canvas) {
        this.canvas = canvas;
    }
}
