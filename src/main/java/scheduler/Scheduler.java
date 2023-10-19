package scheduler;

import java.util.concurrent.LinkedTransferQueue;

public class Scheduler {
	private Application idle;
	private LinkedTransferQueue<Application> applications;
	
	public Scheduler() {
		this.idle = new Application("blanc");
		this.applications = new LinkedTransferQueue<Application>();
	}
	
	public Application getCurrentApplication( ) {
		Application current;
		
		if (applications.isEmpty())
			current = idle;
		else {
			current = applications.remove();
			applications.add(current);
		}
		
		return current;
	}
	
	public void ajouterApplication(Application application) {
		if (application != null)
			applications.add(application);
	}
	
	public void retirerApplication(String color) {
		applications.remove(new Application(color));
	}
}