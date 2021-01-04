package Behavioral.Command;

public class CarRemotePanel {
    public CarRemotePanel() {
    }

    public void executeCommand(ICommand command){
        command.execute();
    }
}
