package Behavioral.State;

public class ComputerPowerOnState implements IComputerState {
    @Override
    public void powerOn() {
        System.out.println("The computer is already turned on");
    }

    @Override
    public void powerOff() {
        System.out.println("The computer is turning on");
    }
}
