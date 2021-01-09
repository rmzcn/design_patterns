package Behavioral.Iterator;

import java.util.ArrayList;
import java.util.List;

public class PhoneAggregate implements IAggregate {
    public List<Phone> phoneList = new ArrayList<Phone>();
    @Override
    public IIterator createIterator() {
        return new PhoneIterator(this);
    }
    public void add(Phone phone){
        phoneList.add(phone);
    }
    public Phone getItem(int index){
        return phoneList.get(index);
    }
     public int getCount(){
        return phoneList.size();
     }
}
