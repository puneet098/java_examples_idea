package org.design.protection.proxy.vehicle;

import org.design.protection.proxy.Drivable;



public class Car implements Drivable {
    protected Driver driver;

    public Car(Driver driver) {
        this.driver = driver;
    }

    @Override
    public void drive() {
        System.out.println("Car is driving.");
    }
}
