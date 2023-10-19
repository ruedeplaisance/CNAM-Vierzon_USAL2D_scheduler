package scheduler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AjouterApplicationListener implements ActionListener {
	private Scheduler scheduler;
	private String color;

	public AjouterApplicationListener(Scheduler scheduler, String color) {
		this.scheduler = scheduler;
		this.color = color;
	}

	public void actionPerformed(ActionEvent e) {
		scheduler.ajouterApplication(new Application(color));
	}
}
