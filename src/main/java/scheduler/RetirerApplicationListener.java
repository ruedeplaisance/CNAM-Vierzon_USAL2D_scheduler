package scheduler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RetirerApplicationListener implements ActionListener {
	private Scheduler scheduler;
	private String color;

	public RetirerApplicationListener(Scheduler scheduler, String color) {
		this.scheduler = scheduler;
		this.color = color;
	}

	public void actionPerformed(ActionEvent e) {
		scheduler.retirerApplication(color);
	}
}
