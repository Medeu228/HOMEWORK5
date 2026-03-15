package edu.narxoz.RPG.decorator;

public class CriticalAttackDecorator extends AttackDecorator {

    public CriticalAttackDecorator(Attack wrappedAttack) {
        super(wrappedAttack);
    }

    @Override
    public String getDescription() {
        return wrappedAttack.getDescription() + " + Critical";
    }

    @Override
    public int getDamage() {
        return wrappedAttack.getDamage() + 10;
    }

    @Override
    public void execute(String attackerName, String targetName) {
        System.out.println(attackerName + " uses " + getDescription() + " on " + targetName);
        System.out.println("Damage: " + getDamage());
        System.out.println("Critical strike landed!");
    }
}