public abstract class Warrior extends Hero {
    protected int skillDamage;

    public Warrior(String name, int healthPoints, int[] damageRange, int attackSpeed, int hitChance,
                   int blockChance, String skillName, int skillHitChance, int skillDamage) {
        super(name, healthPoints, damageRange, attackSpeed, hitChance, blockChance, skillName, skillHitChance);
        this.skillDamage = skillDamage;
    }

    public int getSkillDamage() {
        return skillDamage;
    }
}
