package Structural.Adapter;

public class VGAConnector implements IConnector{
    private ConnectorAdapter connectorAdapter;
    @Override
    public void connect(String monitor, String monitorPortType) {
        if (monitorPortType.equalsIgnoreCase("vga")){
            System.out.println("VGA is connected to " +monitor);
        }
        else if (monitorPortType.equalsIgnoreCase("hdmi") || monitorPortType.equalsIgnoreCase("displayport")){
            connectorAdapter = new ConnectorAdapter(monitorPortType);
            connectorAdapter.connect(monitor,monitorPortType);
        }
        else{
            System.out.println("Invalid port. " + monitorPortType + " port not supported");
        }
    }
}
