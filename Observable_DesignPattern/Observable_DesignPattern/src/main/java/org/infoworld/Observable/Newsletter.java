package org.infoworld.Observable;

import java.util.ArrayList;
import java.util.List;

/*
Let's use an example of a newsletter to implement
the Subject interface. In the following code,
we store our observers—in this case, newsletter
subscribers—and each subscriber is notified
when their email is added to the subscriptions.
 */
public class Newsletter implements Subject{
    protected List<Observer> observers = new ArrayList<>();
    protected String name;
    protected String newEmail;

    public Newsletter(String name) {
        this.name = name;
    }

    public void addNewEmail(String newEmail){
        this.newEmail = newEmail;
        notifySubscribers();
    }

    @Override
    public void addSubscriber(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeSubscriber(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        observers.forEach(observer -> observer.update(newEmail));
    }
}
