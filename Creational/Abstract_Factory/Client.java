package Creational.Abstract_Factory;

import Creational.Abstract_Factory.Abstract.AbstractFactory;
import Creational.Abstract_Factory.Abstract.Charger;
import Creational.Abstract_Factory.Abstract.Phone;

public class Client {
    public static void main(String[] args) {
        AbstractFactory phoneFactory = FactoryProducer.getFactory("phone");
        Phone samsung = phoneFactory.getPhone("samsung");
        samsung.Call();

        AbstractFactory chargerFactory = FactoryProducer.getFactory("charger");
        Charger samsungCharger = chargerFactory.getCharger("samsung");
        samsungCharger.Charge();

    }
}
