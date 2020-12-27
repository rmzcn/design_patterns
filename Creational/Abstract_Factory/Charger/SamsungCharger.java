package Creational.Abstract_Factory.Charger;

import Creational.Abstract_Factory.Abstract.Charger;

public class SamsungCharger implements Charger {
    @Override
    public void Charge() {
        System.out.println("Samsung charger is charging the phone now ");
    }
}
