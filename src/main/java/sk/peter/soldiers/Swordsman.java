package sk.peter.soldiers;

import sk.peter.actions.Attackable;
import sk.peter.actions.Defensible;

public class Swordsman extends Soldier implements Attackable, Defensible {

    public Swordsman(String name, int damage, SoldierType soldierType) {
        super(name, damage, soldierType);
    }

    @Override
    public void attack() {
        System.out.println(getName() + " deals " + getDamage() + " damage.");
    }

    @Override
    public void specialAttack() {
        System.out.println(getName() + " deals " + getDamage() + " damage.");
    }

    @Override
    public void defend() {
        System.out.println(getName() + " deals " + getDamage() + " damage.");
    }

    @Override
    public void specialDefend() {
        System.out.println(getName() + " deals " + getDamage() + " damage.");
    }
}
