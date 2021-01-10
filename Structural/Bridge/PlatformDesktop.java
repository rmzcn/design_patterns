package Structural.Bridge;

public class PlatformDesktop implements IProjectPlatform {
    @Override
    public void build() {
        System.out.println("Project built for desktop platform ");
    }
}
