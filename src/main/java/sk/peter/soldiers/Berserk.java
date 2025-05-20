package sk.peter.soldiers;

import sk.peter.actions.Attackable;

public class Berserk extends Soldier implements Attackable{
    public Berserk(String name, int damage, SoldierType soldierType) {
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
}
