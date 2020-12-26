package Creational.Factory;

public class CarFactory {
    public static ICar createCar(Class classType) throws IllegalAccessException, InstantiationException{
        return (ICar) classType.newInstance();
    }
}
