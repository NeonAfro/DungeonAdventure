package mvcView;

import mvcControl.MVCDungeonAdventure;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JPanel;

public class MVCGameWindow extends JPanel implements Runnable{

	private static final long serialVersionUID = 1L;
	
	
	private Thread gameThread;
	private MVCDungeonAdventure control;
	
	JButton button = new JButton();
	
	public MVCGameWindow(MVCDungeonAdventure dA) {
		this.setPreferredSize(new Dimension(768, 576));
		
		control = dA;
		
		setUpGame();
		
		gamePlayLoop(); // game that isn't real-time dont need thread
	}
	
	private void setUpGame() {
		
	}
//	
//	private void startGameThread() {
//		gameThread = new Thread(this);
//		gameThread.start();
//	}
//	
//	private void gamePlayLoop() {
//		while(gameThread != null) {
//			
//		}
//	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	private void gamePlayLoop() {
		
	}
}
