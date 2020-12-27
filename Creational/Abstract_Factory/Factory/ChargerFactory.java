package Creational.Abstract_Factory.Factory;

import Creational.Abstract_Factory.Abstract.AbstractFactory;
import Creational.Abstract_Factory.Abstract.Charger;
import Creational.Abstract_Factory.Abstract.Phone;
import Creational.Abstract_Factory.Charger.HuaweiCharger;
import Creational.Abstract_Factory.Charger.IPhoneCharger;
import Creational.Abstract_Factory.Charger.SamsungCharger;

public class ChargerFactory extends AbstractFactory {
    @Override
    public Phone getPhone(String phoneModel) {
        return null;
    }

    @Override
    public Charger getCharger(String chargerModel) {
        if (chargerModel.equalsIgnoreCase("samsung")){
            return new SamsungCharger();
        }
        else if (chargerModel.equalsIgnoreCase("huawei")){
            return new HuaweiCharger();
        }
        else if (chargerModel.equalsIgnoreCase("iphone")){
            return new IPhoneCharger();
        }
        return null;
    }
}
