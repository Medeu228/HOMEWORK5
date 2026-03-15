package edu.narxoz.RPG.composite;

public interface CombatNode {
    void showDetails();
    void attack(String targetName);
    int getUnitCount();
}