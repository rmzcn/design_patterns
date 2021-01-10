package Structural.Bridge;

public class CalculatorProject extends Project {
    public CalculatorProject(IProjectPlatform projectPlatform) {
        super(projectPlatform);
    }

    @Override
    public void publish() {
        super.publish();
        System.out.println("Publishing Calculator Project...");
    }
}
