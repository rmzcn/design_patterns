package Behavioral.Command.Baggage.Commands;

import Behavioral.Command.Baggage.Baggage;
import Behavioral.Command.ICommand;

public class OpenBaggageCommand implements ICommand {
    Baggage baggage;
    public OpenBaggageCommand(Baggage baggage) {
        this.baggage = baggage;
    }
    @Override
    public void execute() {
        baggage.open();
    }
}
