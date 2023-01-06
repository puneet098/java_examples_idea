package org.infoworld.Observable;
/*
The Subject interface, also known as Observable or Publisher,
is the basis of the Observable design pattern.
Basically, it stores observers and notifies them
as soon as a watched action happens.
Have a look at the Subject interface.
 */
public interface Subject {
    void addSubscriber(Observer observer);
    void removeSubscriber(Observer observer);
    void notifySubscribers();
}
