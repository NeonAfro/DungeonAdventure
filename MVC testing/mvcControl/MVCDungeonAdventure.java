package mvcControl;

import javax.swing.JFrame;
import mvcModel.MVCCreature;
import mvcModel.MVCDungeon;
import mvcView.MVCGameWindow;

public class MVCDungeonAdventure {
	private MVCGameWindow gameWindow;
	private MVCCreature adventurer;
	private MVCDungeon dungeon;
	
	
	public MVCDungeonAdventure() {
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.setTitle("Dungeon Adventure");
		
		gameWindow = new MVCGameWindow(this);
		
		window.add(gameWindow);
		
		window.pack();
		
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		
		dungeon = new MVCDungeon();
		
		createGame();
		runGame();
	}
	
	public static void main(String[] args) {
		
		MVCDungeonAdventure currentGame = new MVCDungeonAdventure();
	}
	
	private void createGame() {
		adventurer = new MVCCreature();
	}
	
	private void runGame() {
	}
}
