package sk.peter.soldiers;

import sk.peter.actions.Attackable;

public abstract class Soldier implements Attackable {
    private final String name;
    private final int damage;
    private final SoldierType soldierType;

    public Soldier(String name, int damage, SoldierType soldierType) {
        this.name = name;
        this.damage = damage;
        this.soldierType = soldierType;
    }

    public int getDamage() {
        return damage;
    }

    public String getName() {
        return name;
    }

    public SoldierType getSoldierType() {
        return soldierType;
    }


//    @Override
//    public void attack() {
//        System.out.println(this.name + " deals " + this.damage + " damage.");
//    }
//
//    @Override
//    public void specialAttack() {
//        System.out.println(this.name + " deals " + this.damage + " damage.");
//    }
//
//    @Override
//    public void defend() {
//        System.out.println(this.name + " deals " + this.damage + " damage.");
//    }
//
//    @Override
//    public void specialDefend() {
//        System.out.println(this.name + " deals " + this.damage + " damage.");
//    }
}
