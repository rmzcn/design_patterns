package Structural.Adapter;

public class ConnectorAdapter implements IConnector {
    private INewGenConnector newGenConnector;

    public ConnectorAdapter(String connectorType) {
        if (connectorType.equalsIgnoreCase("HDMI")){
            newGenConnector = new HDMIConnector();
        }
        else if (connectorType.equalsIgnoreCase("DisplayPort")){
            newGenConnector = new DisplayPortConnector();
        }
    }

    @Override
    public void connect(String monitor, String monitorPortType) {
        newGenConnector.connectNewGenPort(monitor);
    }
}
