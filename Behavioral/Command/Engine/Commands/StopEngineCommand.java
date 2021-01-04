package Behavioral.Command.Engine.Commands;

import Behavioral.Command.Engine.Engine;
import Behavioral.Command.ICommand;

public class StopEngineCommand implements ICommand {
    Engine engine;
    public StopEngineCommand(Engine baggage) {
        this.engine = engine;
    }
    @Override
    public void execute() {
        engine.stop();
    }
}
