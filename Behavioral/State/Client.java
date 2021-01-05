package Behavioral.State;

public class Client {
    public static void main(String[] args) {
        ComputerContext pcContext = new ComputerContext();
        pcContext.powerOn();
        System.out.println(pcContext.getComputerState().getClass().toString());
        pcContext.powerOn();
        pcContext.powerOff();
        System.out.println(pcContext.getComputerState().getClass().toString());
    }
}
