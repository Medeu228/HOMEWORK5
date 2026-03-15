package edu.narxoz.RPG.bridge;

public class FireballSkill extends Skill {

    public FireballSkill(EffectImplementor effectImplementor) {
        super(effectImplementor);
    }

    @Override
    public void useSkill(String attackerName, String targetName) {
        int baseDamage = 20;

        System.out.println(attackerName + " uses Fireball on " + targetName + "!");
        effectImplementor.applyEffect(attackerName, targetName, baseDamage);
    }
}