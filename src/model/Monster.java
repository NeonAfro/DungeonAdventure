package model;

import model.DungeonCharacter;

public abstract class Monster extends DungeonCharacter {
    protected int healChance;
    protected int[] healRange;

    public Monster(String name, int healthPoints, int[] damageRange, int attackSpeed, int hitChance,
                   int healChance, int[] healRange) {
        super(name, healthPoints, damageRange, attackSpeed, hitChance);
        this.healChance = healChance;
        this.healRange = healRange;
    }

    public int getHealChance() {
        return healChance;
    }

    public int[] getHealRange() {
        return healRange;
    }

    public void heal() {

    }
}
