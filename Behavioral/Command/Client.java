package Behavioral.Command;

import Behavioral.Command.Baggage.Baggage;
import Behavioral.Command.Baggage.Commands.CloseBaggageCommand;
import Behavioral.Command.Baggage.Commands.OpenBaggageCommand;
import Behavioral.Command.Engine.Commands.StartEngineCommand;
import Behavioral.Command.Engine.Commands.StopEngineCommand;
import Behavioral.Command.Engine.Engine;

public class Client {
    public static void main(String[] args) {
        CarRemotePanel panel = new CarRemotePanel();
        Engine engine = new Engine();
        Baggage baggage = new Baggage();

        panel.executeCommand(new StartEngineCommand(engine));
        panel.executeCommand(new StopEngineCommand(engine));

        panel.executeCommand(new OpenBaggageCommand(baggage));
        panel.executeCommand(new CloseBaggageCommand(baggage));


    }
}
