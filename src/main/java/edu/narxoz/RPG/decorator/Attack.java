package edu.narxoz.RPG.decorator;

public interface Attack {
    String getDescription();
    int getDamage();
    void execute(String attackerName, String targetName);
}