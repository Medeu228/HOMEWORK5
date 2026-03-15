package edu.narxoz.RPG.enemy;

public class Enemy {
    private String name;
    private int hp;

    public Enemy(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void showInfo() {
        System.out.println("Enemy: " + name + ", HP: " + hp);
    }
}