package mvcModel;

import javax.swing.JOptionPane;

public class MVCCreature {
	private int hp;
	
	
	public MVCCreature() {
		String name = JOptionPane.showInputDialog("Enter Hero");
		JOptionPane.showMessageDialog(null, "Hero: " + name);
		// ask which hero the player will use
		
	}
}
