package Structural.Adapter;

public class DisplayPortConnector implements INewGenConnector {
    @Override
    public void connectNewGenPort(String monitor) {
        System.out.println("Display port is connected to " +monitor);
    }
}
