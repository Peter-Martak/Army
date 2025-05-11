package sk.peter;

public class Main {
    public static void main(String[] args) {
        Army army = new Army();

        army.reportArmy();

        army.attack();
        army.defend();
        army.specialAttack();
        army.specialDefend();
        army.flankAttack();
    }
}
