package Behavioral.Command.Baggage.Commands;

import Behavioral.Command.Baggage.Baggage;
import Behavioral.Command.ICommand;

public class CloseBaggageCommand implements ICommand {
    Baggage baggage;
    public CloseBaggageCommand(Baggage baggage) {
        this.baggage = baggage;
    }

    @Override
    public void execute() {
        baggage.close();
    }
}
