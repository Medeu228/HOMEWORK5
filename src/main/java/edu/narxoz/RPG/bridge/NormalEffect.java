package edu.narxoz.RPG.bridge;

public class NormalEffect implements EffectImplementor {

    @Override
    public void applyEffect(String attackerName, String targetName, int baseDamage) {
        System.out.println(attackerName + " hits " + targetName + " with normal effect.");
        System.out.println("Damage dealt: " + baseDamage);
    }
}