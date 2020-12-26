package Creational.Factory;

public class Tesla implements ICar {
    @Override
    public void goForward() {
        System.out.println("Tesla is moving forward");
    }

    @Override
    public void goBack() {
        System.out.println("Tesla is moving back");
    }
}
