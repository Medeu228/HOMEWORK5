package edu.narxoz.RPG.bridge;

public abstract class Skill {
    protected EffectImplementor effectImplementor;

    public Skill(EffectImplementor effectImplementor) {
        this.effectImplementor = effectImplementor;
    }

    public abstract void useSkill(String attackerName, String targetName);
}