package scheduler;

public class MiniOS implements Runnable {
	@Override
	public void run() {
		Scheduler scheduler;
		MiniWindow window;
		
		scheduler = new Scheduler();
		
		window = new MiniWindow(scheduler);
		window.setVisible(true);
		window.resetPanels();
		
		new Thread(new CPU(window, scheduler), "CPU").start();
	}
}
