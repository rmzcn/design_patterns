package Creational.Abstract_Factory.Phone;

import Creational.Abstract_Factory.Abstract.Phone;

public class Huawei implements Phone {
    @Override
    public void Call() {
        System.out.println("Huawei phone is calling now");
    }
}
