package Behavioral.Observer;

public class OtherStoreObserver extends Observer {
    public OtherStoreObserver(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    void update() {
        System.out.println("other stores will be notified of a price change...");
    }
}
