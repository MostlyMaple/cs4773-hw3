package application;

import application.chainofcommand.HandlerChain;
import application.commandinterpreter.CommandInterpreter;

import java.io.FileWriter;
import java.io.IOException;

import application.canvas.Canvas;
import application.commands.CommandHistory;
import application.commands.CommandLoader;

public class Main {
    public static void main(String[] args) {
        String filename = args[0];
        Canvas canvas = new Canvas();
        CommandLoader commandLoader = new CommandLoader();
        CommandHistory commandHistory = new CommandHistory();
        HandlerChain handlerChain = new HandlerChain(canvas, commandLoader, commandHistory);

        CommandInterpreter commandInterpreter = new CommandInterpreter(filename, handlerChain);
        commandInterpreter.readCommands();
        writeToFile(canvas);
    }
    
    public static void writeToFile(Canvas canvas) {
    	try {
    		FileWriter outputFile = new FileWriter("output.txt");
    	    outputFile.write(canvas.getOutputString());
    	    outputFile.close();
    	} catch (IOException e) {
    	    System.out.println("An error occurred.");
    	    e.printStackTrace();
    	}
    }
}