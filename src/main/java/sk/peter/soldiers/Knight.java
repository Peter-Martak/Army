package sk.peter.soldiers;

public class Knight extends Soldier{

    public Knight(String name, int damage, SoldierType soldierType) {

        super(name, damage, soldierType);
    }

    public void flankAttack(){
        System.out.println(this.getName() + " is flanking");
    }
}
