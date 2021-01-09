package Behavioral.Iterator;

public class PhoneIterator implements IIterator {
    PhoneAggregate aggregate;
    int currentIndex;
    public PhoneIterator(PhoneAggregate phoneAggregate) {
        this.aggregate = phoneAggregate;
    }

    @Override
    public boolean hasItem() {
        if(currentIndex < aggregate.getCount()){
            return true;
        }
        return false;
    }

    @Override
    public Phone nextItem() {
        if (hasItem()){
            return aggregate.getItem(currentIndex++);
        }
        return new Phone();
    }

    @Override
    public Phone currentItem() {
        return aggregate.getItem(currentIndex);
    }
}
