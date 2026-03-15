package edu.narxoz.RPG;

import edu.narxoz.RPG.bridge.CriticalEffect;
import edu.narxoz.RPG.bridge.EffectImplementor;
import edu.narxoz.RPG.bridge.FireballSkill;
import edu.narxoz.RPG.bridge.NormalEffect;
import edu.narxoz.RPG.bridge.PoisonEffect;
import edu.narxoz.RPG.bridge.Skill;
import edu.narxoz.RPG.bridge.SlashSkill;
import edu.narxoz.RPG.composite.RaidGroup;
import edu.narxoz.RPG.composite.UnitLeaf;
import edu.narxoz.RPG.engine.RaidEngine;
import edu.narxoz.RPG.model.Fighter;

public class Main {
    public static void main(String[] args) {

        EffectImplementor normalEffect = new NormalEffect();
        EffectImplementor criticalEffect = new CriticalEffect();
        EffectImplementor poisonEffect = new PoisonEffect();

        Skill warriorSkill = new SlashSkill(normalEffect);
        Skill mageSkill = new FireballSkill(poisonEffect);
        Skill assassinSkill = new SlashSkill(criticalEffect);
        Skill bossSkill = new FireballSkill(criticalEffect);

        Fighter warrior = new Fighter("Warrior", 100, warriorSkill);
        Fighter mage = new Fighter("Mage", 80, mageSkill);
        Fighter assassin = new Fighter("Assassin", 70, assassinSkill);
        Fighter boss = new Fighter("Dragon Boss", 300, bossSkill);

        UnitLeaf warriorLeaf = new UnitLeaf(warrior);
        UnitLeaf mageLeaf = new UnitLeaf(mage);
        UnitLeaf assassinLeaf = new UnitLeaf(assassin);
        UnitLeaf bossLeaf = new UnitLeaf(boss);

        RaidGroup teamAlpha = new RaidGroup("Team Alpha");
        teamAlpha.add(warriorLeaf);
        teamAlpha.add(mageLeaf);

        RaidGroup teamBeta = new RaidGroup("Team Beta");
        teamBeta.add(assassinLeaf);

        RaidGroup mainRaid = new RaidGroup("Main Raid");
        mainRaid.add(teamAlpha);
        mainRaid.add(teamBeta);

        RaidGroup bossRaid = new RaidGroup("Boss Raid");
        bossRaid.add(bossLeaf);

        RaidEngine raidEngine = new RaidEngine();

        raidEngine.showRaidInfo(mainRaid);
        raidEngine.showRaidInfo(bossRaid);

        raidEngine.startRaidAttack(mainRaid, "Dragon Boss");
        raidEngine.startRaidAttack(bossRaid, "Main Raid");
    }
}