package Creational.Factory;

public class Ford implements ICar {

    private String model;
    @Override
    public void goForward() {
        System.out.println("Ford is moving forward");
    }

    @Override
    public void goBack() {
        System.out.println("Ford is moving back");
    }

    public String getModel(){
        return model;
    }
}
