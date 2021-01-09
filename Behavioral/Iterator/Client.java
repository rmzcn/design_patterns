package Behavioral.Iterator;

public class Client {
    public static void main(String[] args) {
        PhoneAggregate aggregate = new PhoneAggregate();
        aggregate.add( new Phone("samsung","s6", 4000));
        aggregate.add( new Phone("apple","IPhone X", 10000));
        aggregate.add( new Phone("huawei","p40", 12000));

        IIterator iterator = aggregate.createIterator();
        while (iterator.hasItem()){
            System.out.println("marka : " + iterator.currentItem().brand+ " model: "+iterator.currentItem().model + " fiyat" + iterator.currentItem().price);
            iterator.nextItem();
        }
    }
}
