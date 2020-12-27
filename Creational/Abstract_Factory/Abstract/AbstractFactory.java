package Creational.Abstract_Factory.Abstract;

public abstract class AbstractFactory {
    public abstract Phone getPhone(String phoneModel);
    public abstract Charger getCharger(String chargerModel);
}
