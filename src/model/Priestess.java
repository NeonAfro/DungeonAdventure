package model;

import model.Hero;

public abstract class Priestess extends Hero {
    protected int skillHealing;

    public Priestess(String name, int healthPoints, int[] damageRange, int attackSpeed, int hitChance,
                     int blockChance, String skillName, int skillHitChance, int skillHealing) {
        super(name, healthPoints, damageRange, attackSpeed, hitChance, blockChance, skillName, skillHitChance);
        this.skillHealing = skillHealing;
    }

    public int getSkillHealing() {
        return skillHealing;
    }
}
