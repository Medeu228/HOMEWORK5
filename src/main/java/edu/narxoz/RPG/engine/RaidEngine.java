package edu.narxoz.RPG.engine;

import edu.narxoz.RPG.composite.CombatNode;

public class RaidEngine {

    public void showRaidInfo(CombatNode node) {
        System.out.println("===== RAID INFO =====");
        node.showDetails();
        System.out.println("Total units: " + node.getUnitCount());
        System.out.println();
    }

    public void startRaidAttack(CombatNode attackers, String targetName) {
        System.out.println("===== RAID BATTLE START =====");
        attackers.attack(targetName);
        System.out.println("===== RAID BATTLE END =====");
        System.out.println();
    }
}