package Creational.Factory;

public class Tesla implements ICar {

    private String model;
    @Override
    public void goForward() {
        System.out.println("Tesla is moving forward");
    }

    @Override
    public void goBack() {
        System.out.println("Tesla is moving back");
    }

    public String getModel(){
        return model;
    }
}
