package edu.narxoz.RPG.facade;

import edu.narxoz.RPG.hero.Hero;

public class RewardSystem {

    public void giveReward(Hero hero) {
        System.out.println("=== REWARD PHASE ===");
        System.out.println(hero.getName() + " receives 100 gold and 1 rare item.");
        System.out.println();
    }
}