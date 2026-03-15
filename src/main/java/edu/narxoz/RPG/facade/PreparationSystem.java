package edu.narxoz.RPG.facade;

import edu.narxoz.RPG.hero.Hero;
import edu.narxoz.RPG.enemy.Enemy;

public class PreparationSystem {

    public void prepare(Hero hero, Enemy enemy) {
        System.out.println("=== PREPARATION PHASE ===");
        hero.showInfo();
        enemy.showInfo();
        System.out.println(hero.getName() + " enters the dungeon.");
        System.out.println();
    }
}