package edu.narxoz.RPG.bridge;

public class CriticalEffect implements EffectImplementor {

    @Override
    public void applyEffect(String attackerName, String targetName, int baseDamage) {
        int criticalDamage = baseDamage * 2;

        System.out.println(attackerName + " hits " + targetName + " with CRITICAL effect!");
        System.out.println("Damage dealt: " + criticalDamage);
    }
}