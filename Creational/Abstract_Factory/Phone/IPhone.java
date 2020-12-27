package Creational.Abstract_Factory.Phone;

import Creational.Abstract_Factory.Abstract.Phone;

public class IPhone implements Phone {
    @Override
    public void Call() {
        System.out.println("IPhone phone is calling now");
    }
}
