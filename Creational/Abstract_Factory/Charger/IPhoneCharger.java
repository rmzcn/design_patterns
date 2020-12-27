package Creational.Abstract_Factory.Charger;

import Creational.Abstract_Factory.Abstract.Charger;

public class IPhoneCharger implements Charger {
    @Override
    public void Charge() {
        System.out.println("IPhone charger is charging the phone now ");
    }
}
