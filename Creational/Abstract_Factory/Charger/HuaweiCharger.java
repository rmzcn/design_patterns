package Creational.Abstract_Factory.Charger;

import Creational.Abstract_Factory.Abstract.Charger;

public class HuaweiCharger implements Charger {
    @Override
    public void Charge() {
        System.out.println("Huawei charger is charging the phone now ");
    }
}
