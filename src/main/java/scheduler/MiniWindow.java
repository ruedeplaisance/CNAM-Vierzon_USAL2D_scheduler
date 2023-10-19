package scheduler;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Container;

public class MiniWindow extends JFrame {
	private static final long serialVersionUID = 1L;
	private static final int panelSize = 12;
	public static final int panelX = 64;
	public static final int panelY = 32;
	
	private Scheduler scheduler;
	
	private Container contentPane;
	public JPanel[][] panels;
	public JButton btn;
	
	public MiniWindow(Scheduler scheduler) {
		this.scheduler = scheduler;
		
		panels = new JPanel[panelX][panelY];
		
		setTitle("Mini OS");
		setResizable(false);
		setBounds(100, 100, (panelX+2)*panelSize, 200+(panelY+2)*panelSize);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = getContentPane(); 
		contentPane.setLayout(null);
		
		for (int y = 0; y < panelY; y++)
			for (int x = 0; x < panelX; x++) {
				panels[x][y] = new JPanel();
				panels[x][y].setBounds((x*panelSize)+4, (y*panelSize)+4, panelSize-1, panelSize-1);
				panels[x][y].setLayout(null);
				
				contentPane.add(panels[x][y]);
			}
		
		int delta;
		
		delta = 0;
		
		btn = new JButton("ajoute bleu");
		btn.setBounds(10+delta, panelY*panelSize+10, 100, 23);
		btn.addActionListener(new AjouterApplicationListener(this.scheduler, "bleu"));
		contentPane.add(btn);

		btn = new JButton("retire bleu");
		btn.setBounds(10+delta, panelY*panelSize+40, 100, 23);
		btn.addActionListener(new RetirerApplicationListener(this.scheduler, "bleu"));
		contentPane.add(btn);

		delta += 110;
		btn = new JButton("ajoute rouge");
		btn.setBounds(10+delta, panelY*panelSize+10, 100, 23);
		btn.addActionListener(new AjouterApplicationListener(this.scheduler, "rouge"));
		contentPane.add(btn);

		btn = new JButton("retire rouge");
		btn.setBounds(10+delta, panelY*panelSize+40, 100, 23);
		btn.addActionListener(new RetirerApplicationListener(this.scheduler, "rouge"));
		contentPane.add(btn);

		delta += 110;
		btn = new JButton("ajoute vert");
		btn.setBounds(10+delta, panelY*panelSize+10, 100, 23);
		btn.addActionListener(new AjouterApplicationListener(this.scheduler, "vert"));
		contentPane.add(btn);

		btn = new JButton("retire vert");
		btn.setBounds(10+delta, panelY*panelSize+40, 100, 23);
		btn.addActionListener(new RetirerApplicationListener(this.scheduler, "vert"));
		contentPane.add(btn);

		delta += 110;
		btn = new JButton("ajoute jaune");
		btn.setBounds(10+delta, panelY*panelSize+10, 100, 23);
		btn.addActionListener(new AjouterApplicationListener(this.scheduler, "jaune"));
		contentPane.add(btn);

		btn = new JButton("retire jaune");
		btn.setBounds(10+delta, panelY*panelSize+40, 100, 23);
		btn.addActionListener(new RetirerApplicationListener(this.scheduler, "jaune"));
		contentPane.add(btn);

		delta += 110;
		btn = new JButton("ajoute cyan");
		btn.setBounds(10+delta, panelY*panelSize+10, 100, 23);
		btn.addActionListener(new AjouterApplicationListener(this.scheduler, "cyan"));
		contentPane.add(btn);

		btn = new JButton("retire cyan");
		btn.setBounds(10+delta, panelY*panelSize+40, 100, 23);
		btn.addActionListener(new RetirerApplicationListener(this.scheduler, "cyan"));
		contentPane.add(btn);

		delta += 110;
		btn = new JButton("ajoute violet");
		btn.setBounds(10+delta, panelY*panelSize+10, 100, 23);
		btn.addActionListener(new AjouterApplicationListener(this.scheduler, "violet"));
		contentPane.add(btn);

		btn = new JButton("retire violet");
		btn.setBounds(10+delta, panelY*panelSize+40, 100, 23);
		btn.addActionListener(new RetirerApplicationListener(this.scheduler, "violet"));
		contentPane.add(btn);
	}
	
	public void resetPanels() {
		for (int y = 0; y < panelY; y++)
			for (int x = 0; x < panelX; x++)
				panels[x][y].setBackground(new Color(0, 0, 0));
		repaint();
	}
}