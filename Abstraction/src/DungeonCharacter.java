public abstract class DungeonCharacter {
    protected String name;
    protected int healthPoints;
    protected int[] damageRange;
    protected int attackSpeed;
    protected int hitChance;

    public DungeonCharacter(String name, int healthPoints, int[] damageRange, int attackSpeed, int hitChance) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.damageRange = damageRange;
        this.attackSpeed = attackSpeed;
        this.hitChance = hitChance;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public abstract void attackBehavior();

    // Getters for other attributes
    public String getName() {
        return name;
    }

    public int[] getDamageRange() {
        return damageRange;
    }

    public int getAttackSpeed() {
        return attackSpeed;
    }

    public int getHitChance() {
        return hitChance;
    }
}
