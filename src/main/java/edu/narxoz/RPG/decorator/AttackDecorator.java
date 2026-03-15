package edu.narxoz.RPG.decorator;

public abstract class AttackDecorator implements Attack {
    protected Attack wrappedAttack;

    public AttackDecorator(Attack wrappedAttack) {
        this.wrappedAttack = wrappedAttack;
    }

    @Override
    public String getDescription() {
        return wrappedAttack.getDescription();
    }

    @Override
    public int getDamage() {
        return wrappedAttack.getDamage();
    }

    @Override
    public void execute(String attackerName, String targetName) {
        wrappedAttack.execute(attackerName, targetName);
    }
}