package Behavioral.Command.Engine.Commands;

import Behavioral.Command.Engine.Engine;
import Behavioral.Command.ICommand;

public class StartEngineCommand implements ICommand {
    Engine engine;
    public StartEngineCommand(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void execute() {
        engine.start();
    }
}
