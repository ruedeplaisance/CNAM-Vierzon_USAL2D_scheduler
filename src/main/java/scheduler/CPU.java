package scheduler;

public class CPU implements Runnable {
	private MiniWindow window;
	private Scheduler scheduler;
	
	public CPU(MiniWindow window, Scheduler scheduler) {
		this.window = window;
		this.scheduler = scheduler;
	}
	
	@Override
	public void run() {
		try {
			while (true) {			
				for (int y = 0; y < MiniWindow.panelY; y++)
					for (int x = 0; x < MiniWindow.panelX; x++) {
						Thread.sleep(100);
						window.panels[x][y].setBackground(scheduler.getCurrentApplication().getColor());
					}
				Thread.sleep(100);
				window.resetPanels();
			}
		} catch (InterruptedException e) {
		}
	}
}
