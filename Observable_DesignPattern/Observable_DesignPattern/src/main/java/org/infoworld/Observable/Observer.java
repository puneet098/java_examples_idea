package org.infoworld.Observable;
/*
The Observer interface (also sometimes known as the Subscriber)
is implemented by subscriber, which seeks to
observe whether an action has been performed:
 */
public interface Observer {
    public void update(String email);
}
