package edu.narxoz.RPG.decorator;

public class PoisonAttackDecorator extends AttackDecorator {

    public PoisonAttackDecorator(Attack wrappedAttack) {
        super(wrappedAttack);
    }

    @Override
    public String getDescription() {
        return wrappedAttack.getDescription() + " + Poison";
    }

    @Override
    public int getDamage() {
        return wrappedAttack.getDamage() + 3;
    }

    @Override
    public void execute(String attackerName, String targetName) {
        System.out.println(attackerName + " uses " + getDescription() + " on " + targetName);
        System.out.println("Damage: " + getDamage());
        System.out.println(targetName + " is poisoned.");
    }
}