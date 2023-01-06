package org.design.property.proxy;

public class PropertyProxyDemo {

    public static void main(String[] args){
        Creature c =new Creature();
        c.setAgility(12);
        System.out.println(c.getAgility());
    }

}
