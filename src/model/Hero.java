package model;

import model.DungeonCharacter;

public abstract class Hero extends DungeonCharacter {
    protected int blockChance;
    protected String skillName;
    protected int skillHitChance;

    public Hero(String name, int healthPoints, int[] damageRange, int attackSpeed, int hitChance,
                int blockChance, String skillName, int skillHitChance) {
        super(name, healthPoints, damageRange, attackSpeed, hitChance);
        this.blockChance = blockChance;
        this.skillName = skillName;
        this.skillHitChance = skillHitChance;
    }

    public int getBlockChance() {
        return blockChance;
    }

    public abstract void useSkill();
}
