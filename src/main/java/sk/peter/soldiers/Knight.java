package sk.peter.soldiers;

import sk.peter.actions.Attackable;

public class Knight extends Soldier implements Attackable{

    public Knight(String name, int damage, SoldierType soldierType) {

        super(name, damage, soldierType);
    }

    public void flankAttack(){
        System.out.println(this.getName() + " is flanking");
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
