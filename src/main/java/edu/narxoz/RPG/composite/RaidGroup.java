package edu.narxoz.RPG.composite;

import java.util.ArrayList;
import java.util.List;

public class RaidGroup implements CombatNode {
    private String groupName;
    private List<CombatNode> members;

    public RaidGroup(String groupName) {
        this.groupName = groupName;
        this.members = new ArrayList<>();
    }

    public void add(CombatNode node) {
        members.add(node);
    }

    public void remove(CombatNode node) {
        members.remove(node);
    }

    public List<CombatNode> getMembers() {
        return members;
    }

    @Override
    public void showDetails() {
        System.out.println("Group: " + groupName);
        for (CombatNode member : members) {
            member.showDetails();
        }
    }

    @Override
    public void attack(String targetName) {
        System.out.println("Group " + groupName + " attacks " + targetName + "!");
        for (CombatNode member : members) {
            member.attack(targetName);
        }
    }

    @Override
    public int getUnitCount() {
        int count = 0;
        for (CombatNode member : members) {
            count = count + member.getUnitCount();
        }
        return count;
    }
}