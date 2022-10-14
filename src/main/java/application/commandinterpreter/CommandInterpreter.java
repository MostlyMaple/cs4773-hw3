package application.commandinterpreter;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import application.chainofcommand.HandlerChain;

public class CommandInterpreter {

    private String filename;
    private HandlerChain handlerChain;

    public CommandInterpreter(String filename, HandlerChain handlerChain) {
        this.filename = filename;
        this.handlerChain = handlerChain;
    }

    public void readCommands() {

        String[] command_components;

        try {
            File commandList = new File(this.filename);
            Scanner commandReader = new Scanner(commandList);
            while (commandReader.hasNextLine()) {
                String current_command = commandReader.nextLine();
                command_components = current_command.split(" ");
                this.handlerChain.handleRequest(command_components);
            }
            commandReader.close();
        }
        catch (FileNotFoundException e){
            System.err.println("File not found.");
        }
    }

}