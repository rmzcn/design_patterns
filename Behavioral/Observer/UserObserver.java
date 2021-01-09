package Behavioral.Observer;

public class UserObserver extends Observer {
    public UserObserver(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    void update() {
        System.out.println("Users will be notified of a price change...");
    }
}
