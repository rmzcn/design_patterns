package Structural.Bridge;

public class GameProject extends Project {
    public GameProject(IProjectPlatform projectPlatform) {
        super(projectPlatform);
    }

    @Override
    public void publish() {
        super.publish();
        System.out.println("Publishing Game Project...");
    }
}
