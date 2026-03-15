package edu.narxoz.RPG.composite;

import edu.narxoz.RPG.model.Fighter;

public class UnitLeaf implements CombatNode {
    private Fighter fighter;

    public UnitLeaf(Fighter fighter) {
        this.fighter = fighter;
    }

    public Fighter getFighter() {
        return fighter;
    }

    @Override
    public void showDetails() {
        fighter.showInfo();
    }

    @Override
    public void attack(String targetName) {
        if (fighter.isAlive()) {
            fighter.getSkill().useSkill(fighter.getName(), targetName);
        } else {
            System.out.println(fighter.getName() + " is defeated and cannot attack.");
        }
    }

    @Override
    public int getUnitCount() {
        return 1;
    }
}