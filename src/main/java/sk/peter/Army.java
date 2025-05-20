package sk.peter;

import sk.peter.actions.Attackable;
import sk.peter.actions.Defensible;
import sk.peter.soldiers.*;

import java.util.ArrayList;
import java.util.List;

public class Army {
    private List<Soldier> soldiers;

    public Army() {
        this.createArmy();
    }

    public void createArmy() {
        soldiers = new ArrayList<>();
        this.soldiers.add(new Swordsman("Swordsman 1", 3, SoldierType.ADAPTABLE));
        this.soldiers.add(new Swordsman("Swordsman 2", 3, SoldierType.ADAPTABLE));
        this.soldiers.add(new Archer("Archer 1", 2, SoldierType.DEFENSIVE));
        this.soldiers.add(new Archer("Archer 2", 2, SoldierType.DEFENSIVE));
        this.soldiers.add(new Archer("Archer 3", 2, SoldierType.DEFENSIVE));
        this.soldiers.add(new Spearman("Spearman 1", 4, SoldierType.DEFENSIVE));
        this.soldiers.add(new Spearman("Spearman 2", 4, SoldierType.DEFENSIVE));
        this.soldiers.add(new Berserk("Berserk", 5, SoldierType.OFFENSIVE));
        this.soldiers.add(new Knight("Knight 1", 7, SoldierType.OFFENSIVE));
        this.soldiers.add(new Knight("Knight 2", 7, SoldierType.OFFENSIVE));
        this.soldiers.add(new Knight("Knight 3", 7, SoldierType.OFFENSIVE));
        this.soldiers.add(new Knight("Knight 4", 7, SoldierType.OFFENSIVE));

    }

    public void reportArmy() {
        System.out.println("--------REPORT--------");
        for (Soldier soldier : this.soldiers) {
            System.out.println("Soldier " + soldier.getName() + " here. Type - " + soldier.getSoldierType());
        }
        System.out.println();
        System.out.println();
    }

    public void attack() {
        System.out.println("--------ATTACK--------");
        for (Soldier soldier : this.soldiers) {
            if (soldier instanceof Attackable){
                ((Attackable) soldier).attack();
            }
        }
        System.out.println();
        System.out.println();
    }

    public void defend() {
        System.out.println("--------DEFEND--------");
        for (Soldier soldier : this.soldiers) {
            if (soldier instanceof Defensible){
                ((Defensible) soldier).defend();
            }
        }
        System.out.println();
        System.out.println();
    }

    public void specialAttack() {
        System.out.println("--------FURY ATTACK--------");
        for (Soldier soldier : this.soldiers) {
            if (soldier instanceof Attackable){
                ((Attackable) soldier).specialAttack();
            }
        }
        System.out.println();
        System.out.println();
    }

    public void specialDefend() {
        System.out.println("--------Fire Defend--------");
        for (Soldier soldier : this.soldiers) {
            if (soldier instanceof Defensible){
                ((Defensible) soldier).specialDefend();
            }
        }
        System.out.println();
        System.out.println();
    }

    public void flankAttack() {
        System.out.println("--------FLANK--------");
        for (Soldier soldier : this.soldiers) {
            if (soldier instanceof Knight)
                ((Knight) soldier).flankAttack();
        }
    }
}
