import java.util.Random;

public class Adventurer extends DungeonAdventure {
    private String name;
    private int hitPoints;
    private boolean movable;
    private int potionCount;
    private int potionHeal;


    public Adventurer(String name) {
        this.name = name;
        this.hitPoints = new Random().nextInt(26) + 75; // 75 to 100 inclusive
        this.movable = true;
        this.potionCount = 0;
        this.potionHeal = 20;
    }


    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getHitPoints() {
        return this.hitPoints;
    }


    public void usePotion() {
        if (potionCount > 0) {
            hitPoints += potionHeal;
            potionCount--;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append(name).append("\n");
        sb.append("Hit Points: ").append(hitPoints).append("\n");
        // rest of the to string ill finish when i make other
        return sb.toString();
    }

}
