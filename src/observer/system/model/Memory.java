package observer.system.model;

public class Memory {
	
	private Long totalValue;
	private Long usage;
	private Float temperature;
	
	public Memory(long totalValue) {
		this.totalValue = totalValue;
		this.usage = 0L;
		this.temperature = 20f;
	}

	public void useMemory(long value) {
		if (value + usage <= totalValue) {
			usage += value;
		}
	}
	
	public void clearMemory(long value) {
		if (value <= usage) {
			usage -= value;
		}
	}

	public Long getTotalValue() {
		return totalValue;
	}

	public Long getUsage() {
		return usage;
	}

	public Float getTemperature() {
		return temperature + usage/100;
	}
	
}
