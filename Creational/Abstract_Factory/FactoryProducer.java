package Creational.Abstract_Factory;

import Creational.Abstract_Factory.Abstract.AbstractFactory;
import Creational.Abstract_Factory.Factory.ChargerFactory;
import Creational.Abstract_Factory.Factory.PhoneFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String factory){
        if(factory.equalsIgnoreCase("phone")) {
            return new PhoneFactory();
        }
        else if(factory.equalsIgnoreCase("charger")) {
            return new ChargerFactory();
        }
        return null;
    }
}
