package observer.system.model;

public class Processor {

	private Integer maxProcesses;
	private Integer processesCount;
	private Float temperature;
	
	public Processor(int maxProcesses) {
		this.maxProcesses = maxProcesses;
		this.processesCount = 0;
		this.temperature = 45f;
	}
	
	public void addProcess(int p) {
		if (p + processesCount < maxProcesses) {
			processesCount += p;
			temperature += p/100;
		}
	}
	
	public void removeProcess(int p) {
		if (processesCount > p) {
			processesCount -= p;
			temperature -= p/100;
		}
	}

	public Integer getMaxProcesses() {
		return maxProcesses;
	}

	public Integer getProcessesCount() {
		return processesCount;
	}

	public Float getTemperature() {
		return temperature;
	}
	
}
