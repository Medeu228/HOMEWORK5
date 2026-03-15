package edu.narxoz.RPG.decorator;

public class FireAttackDecorator extends AttackDecorator {

    public FireAttackDecorator(Attack wrappedAttack) {
        super(wrappedAttack);
    }

    @Override
    public String getDescription() {
        return wrappedAttack.getDescription() + " + Fire";
    }

    @Override
    public int getDamage() {
        return wrappedAttack.getDamage() + 5;
    }

    @Override
    public void execute(String attackerName, String targetName) {
        System.out.println(attackerName + " uses " + getDescription() + " on " + targetName);
        System.out.println("Damage: " + getDamage());
        System.out.println(targetName + " is burned.");
    }
}