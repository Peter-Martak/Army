package sk.peter.soldiers;

public enum SoldierType {

    OFFENSIVE("offensive"),
    DEFENSIVE("defensive"),
    ADAPTABLE("adaptable");

    private final String type;

    SoldierType(String type) {
        this.type = type;
    }
}
