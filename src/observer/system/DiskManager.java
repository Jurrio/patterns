package observer.system;

public class DiskManager implements Observer, DisplayInfo{

	private float totalSpace;
	private float freeSpace;
	private Subject subject;
	
	public DiskManager(Subject subj) {
		this.subject = subj;
		subject.registerObserver(this);
	}
	
	@Override
	public void update() {
		if (subject instanceof SystemInfo) {
			SystemInfo info = (SystemInfo) subject;
			totalSpace = info.getHdd().getTotalMemory();
			freeSpace = info.getHdd().getFreeSpace();
			display();
		}
	}

	@Override
	public void display() {
		System.out.println("HDD info. Total space: " + totalSpace + "Gb; free space: " + freeSpace + "Gb");
		
	}

}
