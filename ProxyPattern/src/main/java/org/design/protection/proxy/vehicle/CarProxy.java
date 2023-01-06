package org.design.protection.proxy.vehicle;

public class CarProxy extends Car{

    public CarProxy(Driver driver) {
       super(driver);
    }

    public void drive() {
        if(driver.age >= 16)
            super.drive();
        else
            System.out.println("Driver too young");
    }
}
