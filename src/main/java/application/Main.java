package application;

import application.chainofcommand.HandlerChain;
import application.commandinterpreter.CommandInterpreter;
import application.canvas.Canvas;
import application.commands.CommandLoader;

public class Main {
    public static void main(String[] args) {
        String filename = args[0];
        Canvas canvas = new Canvas();
        CommandLoader commandLoader = new CommandLoader();

        HandlerChain handlerChain = new HandlerChain(canvas, commandLoader);

        CommandInterpreter commandInterpreter = new CommandInterpreter(filename, handlerChain);
        commandInterpreter.readCommands();

        System.out.println(canvas.getShapes().get(0).toString());
    }
}