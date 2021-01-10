package Structural.Bridge;

public class Project {
    public IProjectPlatform projectPlatform;

    public Project(IProjectPlatform projectPlatform) {
        this.projectPlatform = projectPlatform;
    }

    public void publish(){
        System.out.println("The project is building before it publishing...");
        projectPlatform.build();
    }
}
