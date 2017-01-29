package observer.system;

public class TaskManager implements Observer, DisplayInfo {

	
	private Integer maxProcessors;
	private Integer countProcessor;
	private Long totalMemory;
	private Long usageMemory;
	private Float maxSpeed;
	private Float lanSpeed;
	private Subject subject;
	
	public TaskManager(Subject subj) {
		this.subject = subj;
		subject.registerObserver(this);
	}
	
	@Override
	public void update() {
		if (subject instanceof SystemInfo) {
			SystemInfo info = (SystemInfo) subject;
			maxProcessors = info.getCpu().getMaxProcesses();
			countProcessor = info.getCpu().getProcessesCount();
			totalMemory = info.getRam().getTotalValue();
			usageMemory = info.getRam().getUsage();
			maxSpeed = info.getLan().getMaxSpeed();
			lanSpeed = info.getLan().getCurrentSpeed();
			display();
		}	
	}

	@Override
	public void display() {
		System.out.println("Task manager. Used CPU: " + countProcessor + "/" + maxProcessors + ". Used memory: " + usageMemory + "/" + totalMemory + ". Network: " + lanSpeed + "/" + maxSpeed);
	}
}
