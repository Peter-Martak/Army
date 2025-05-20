package sk.peter.soldiers;

public abstract class Soldier {
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
}
