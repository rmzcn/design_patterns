package Structural.Adapter;

public class HDMIConnector implements INewGenConnector{

    @Override
    public void connectNewGenPort(String monitor) {
        System.out.println("HDMI is connected to " +monitor);
    }
}
