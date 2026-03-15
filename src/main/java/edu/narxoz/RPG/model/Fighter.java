package edu.narxoz.RPG.model;


import edu.narxoz.RPG.bridge.Skill;

public class Fighter {
    private String name;
    private int hp;
    private Skill skill;

    public Fighter(String name, int hp, Skill skill) {
        this.name = name;
        this.hp = hp;
        this.skill = skill;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public Skill getSkill() {
        return skill;
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public void takeDamage(int damage) {
        hp = hp - damage;
        if (hp < 0) {
            hp = 0;
        }
    }

    public void showInfo() {
        System.out.println("Fighter: " + name + ", HP: " + hp);
    }
}