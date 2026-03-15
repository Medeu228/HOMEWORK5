package edu.narxoz.RPG.facade;

import edu.narxoz.RPG.decorator.Attack;
import edu.narxoz.RPG.enemy.Enemy;
import edu.narxoz.RPG.hero.Hero;

public class DungeonFacade {
    private PreparationSystem preparationSystem;
    private BattleSystem battleSystem;
    private RewardSystem rewardSystem;

    public DungeonFacade() {
        this.preparationSystem = new PreparationSystem();
        this.battleSystem = new BattleSystem();
        this.rewardSystem = new RewardSystem();
    }

    public void runDungeon(Hero hero, Enemy enemy, Attack attack) {
        System.out.println("===== DUNGEON RUN START =====");
        preparationSystem.prepare(hero, enemy);
        battleSystem.startBattle(hero, enemy, attack);
        rewardSystem.giveReward(hero);
        System.out.println("===== DUNGEON RUN END =====");
    }
}