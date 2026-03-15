package edu.narxoz.RPG.hero;

public class Hero {
    private String name;
    private int hp;

    public Hero(String name, int hp) {
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
        System.out.println("Hero: " + name + ", HP: " + hp);
    }
}