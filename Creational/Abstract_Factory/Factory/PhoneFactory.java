package Creational.Abstract_Factory.Factory;

import Creational.Abstract_Factory.Abstract.AbstractFactory;
import Creational.Abstract_Factory.Abstract.Charger;
import Creational.Abstract_Factory.Abstract.Phone;
import Creational.Abstract_Factory.Phone.Huawei;
import Creational.Abstract_Factory.Phone.IPhone;
import Creational.Abstract_Factory.Phone.Samsung;

public class PhoneFactory extends AbstractFactory {
    @Override
    public Phone getPhone(String phoneModel) {
        if (phoneModel.equalsIgnoreCase("samsung")){
            return new Samsung();
        }
        else if (phoneModel.equalsIgnoreCase("huawei")){
            return new Huawei();
        }
        else if (phoneModel.equalsIgnoreCase("iphone")){
            return new IPhone();
        }
        return null;
    }

    @Override
    public Charger getCharger(String chargerModel) {
        return null;
    }
}
