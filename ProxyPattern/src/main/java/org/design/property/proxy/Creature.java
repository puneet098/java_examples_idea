package org.design.property.proxy;

public class Creature {

    private Property<Integer> agility = new Property<>(10);

    public Integer getAgility() {
        return agility.getValue();
    }

    public void setAgility(Integer value) {
        System.out.println("value set is:"+value);
        agility.setValue(value);
    }
}
