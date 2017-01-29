package observer.system.model;

public class HardDrive{

	private Float totalMemory;
	private Float freeSpace;
	private Float temperature;
	private Integer speed;
	
	public HardDrive(Float totalMemory) {
		this.totalMemory = totalMemory;
		this.freeSpace = totalMemory;
		this.temperature = 20f;
	}
	
	public void writeData(Float dataSize) {
		if (dataSize <= freeSpace) {
			freeSpace -= dataSize;
		}
	}

	public float getTotalMemory() {
		return totalMemory;
	}

	public float getFreeSpace() {
		return freeSpace;
	}

	public float getTemperature() {
		return temperature + (totalMemory - freeSpace)/100;
	}

	public int getSpeed() {
		return speed;
	}
	
	
}
