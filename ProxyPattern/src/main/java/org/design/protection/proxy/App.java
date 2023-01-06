package org.design.protection.proxy;


import org.design.protection.proxy.vehicle.CarProxy;
import org.design.protection.proxy.vehicle.Driver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Drivable car = new CarProxy(new Driver(12));
        car.drive();
        System.out.println("Hello World!" );
    }
}
