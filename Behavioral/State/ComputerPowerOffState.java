package Behavioral.State;

public class ComputerPowerOffState implements IComputerState {
    @Override
    public void powerOn() {
        System.out.println("The computer is turning on");
    }

    @Override
    public void powerOff() {
        System.out.println("The computer is already turned off");
    }
}
