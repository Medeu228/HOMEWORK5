package edu.narxoz.RPG.bridge;

public class PoisonEffect implements EffectImplementor {

    @Override
    public void applyEffect(String attackerName, String targetName, int baseDamage) {
        int poisonDamage = baseDamage + 5;

        System.out.println(attackerName + " hits " + targetName + " with poison effect.");
        System.out.println("Damage dealt: " + poisonDamage);
        System.out.println(targetName + " is poisoned for next turn.");
    }
}