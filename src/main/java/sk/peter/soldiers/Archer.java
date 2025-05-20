package sk.peter.soldiers;

import sk.peter.actions.Defensible;

public class Archer extends Soldier implements Defensible{

    public Archer(String name, int damage, SoldierType soldierType) {
        super(name, damage, soldierType);
    }

    @Override
    public void defend() {
        System.out.println(getName()+ " deals " + getDamage() + " damage.");
    }

    @Override
    public void specialDefend() {
        System.out.println(getName() + " deals " + getDamage() + " damage.");
    }
}
