package Structural.Bridge;

public class PlatformMobile implements IProjectPlatform {
    @Override
    public void build() {
        System.out.println("Project built for mobile platform ");
    }
}
