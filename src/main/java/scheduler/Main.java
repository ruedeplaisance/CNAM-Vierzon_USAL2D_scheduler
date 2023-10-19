package scheduler;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class Main {
	public static void main(String[] args) {
		LookAndFeelSystem();
		SwingUtilities.invokeLater(new MiniOS());
	}
	
	public static void LookAndFeelSystem()
	{
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} 
		catch (Exception e) {
			// Ne rien faire et laisser le LookAndFeel par défaut s'exprimer
		}
	}
}
