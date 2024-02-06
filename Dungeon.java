

public class Dungeon extends DungeonAdventure {
    private int[][] maze;
    private int[] playerLocation;

    public Dungeon() {
    }

    public Dungeon(int rows, int columns) {
        this.maze = new int[rows][columns];
        this.playerLocation = new int[2];
        generateEntrance();
        generateExit();
        generatePillars();
    }

    public void generatePillars() {

    }

    public void generateEntrance() {

        this.playerLocation[0] = 0; // Row
        this.playerLocation[1] = 0; // Column
    }

    public void generateExit() {

        this.maze[maze.length - 1][maze[0].length - 1] = 3; // Placeholder for exit at bottom right corner
    }



    @Override
    public String toString() {
        // Build a string representation of the dungeon maze
        StringBuilder sb = new StringBuilder();
        for (int[] row : maze) {
            for (int cell : row) {
                sb.append(cell).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
