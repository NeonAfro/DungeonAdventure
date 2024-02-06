package mvcModel;

public class MVCDungeon {
	private char[][] maze; // 4x4 grid to test
	private int[] playerLocation; // [x, y] coordinate
	
	public MVCDungeon() { // pass in difficulty field (feature)
		generateMaze();
	}
	
	/** 
	 * example: "*" denotes closed, "-" deonotes open
	 		*-*
			|P|
		 	*-*
	 */
	
	/** 
	    M - Multiple Items
		X - Pit
		i - Entrance (In)
		O - Exit (Out)
		V - Vision Potion
		H - Healing Potion ▪ <space> - Empty Room
		A, E, I, P - Pillars
	 */
	
	private void generateMaze() { // randomly generate maze (feature)
		maze = new char[9][9]; // 4x4, 5 slots for edges and relation
	}
	public int[] getPos() {
		
		return playerLocation;
	}
}
