public class DungeonAdventure {
    private Adventurer adventurer;
    private Dungeon dungeon;
    private GameWindow gameWindow;

    public DungeonAdventure() {

        this.gameWindow = new GameWindow();
    }

    public void createHero() {
        // Method logic to create a hero
    }

    public void createDungeon() {
        // Method logic to create a dungeon
    }

    public void createGame() {
        gameWindow.runGame();
    }
}
