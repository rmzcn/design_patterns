package Creational.Abstract_Factory.Phone;

import Creational.Abstract_Factory.Abstract.Phone;

public class Samsung implements Phone {
    @Override
    public void Call() {
        System.out.println("Samsung phone is calling now");
    }
}
