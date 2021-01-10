package Structural.Adapter;

public class Client {
    public static void main(String[] args) {
        VGAConnector connector = new VGAConnector();

        connector.connect("Asus monitor", "hdmi");
        connector.connect("Dell monitor", "vga");
        connector.connect("HP monitor", "displayport");
        connector.connect("Unknown monitor", "xyz");
    }
}
