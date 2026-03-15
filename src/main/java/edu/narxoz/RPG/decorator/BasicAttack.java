package edu.narxoz.RPG.decorator;

public class BasicAttack implements Attack {

    @Override
    public String getDescription() {
        return "Basic Attack";
    }

    @Override
    public int getDamage() {
        return 10;
    }

    @Override
    public void execute(String attackerName, String targetName) {
        System.out.println(attackerName + " uses " + getDescription() + " on " + targetName);
        System.out.println("Damage: " + getDamage());
    }
}