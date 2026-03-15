package edu.narxoz.RPG.bridge;

public class SlashSkill extends Skill {

    public SlashSkill(EffectImplementor effectImplementor) {
        super(effectImplementor);
    }

    @Override
    public void useSkill(String attackerName, String targetName) {
        int baseDamage = 15;

        System.out.println(attackerName + " uses Slash on " + targetName + "!");
        effectImplementor.applyEffect(attackerName, targetName, baseDamage);
    }
}