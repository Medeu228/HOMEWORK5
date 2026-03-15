package edu.narxoz.RPG.facade;

import edu.narxoz.RPG.decorator.Attack;
import edu.narxoz.RPG.enemy.Enemy;
import edu.narxoz.RPG.hero.Hero;

public class BattleSystem {

    public void startBattle(Hero hero, Enemy enemy, Attack attack) {
        System.out.println("=== BATTLE PHASE ===");
        attack.execute(hero.getName(), enemy.getName());
        System.out.println(enemy.getName() + " receives the attack.");
        System.out.println();
    }
}