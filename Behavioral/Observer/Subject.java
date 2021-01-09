package Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    private float price;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        this.observers.add(observer);
    }

    public void notifyAllObservers(){
        for(Observer observer : observers){
            observer.update();
        }
    }
}
