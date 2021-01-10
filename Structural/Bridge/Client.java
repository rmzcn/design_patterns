package Structural.Bridge;

public class Client {
    public static void main(String[] args) {
        Project gameProject = new GameProject(new PlatformMobile());
        gameProject.publish();
        System.out.println("**************");
        Project calculatorProject = new CalculatorProject(new PlatformDesktop());
        calculatorProject.publish();
    }
}
