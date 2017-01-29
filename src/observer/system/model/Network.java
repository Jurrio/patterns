package observer.system.model;

public class Network {
	
	private Float maxSpeed;
	private Float currentSpeed;
	private Float temperature;

	public Network(float maxSpeed) {
		this.maxSpeed = maxSpeed;
		this.currentSpeed = 0f;
		this.temperature = 20f;
	}

	public Float getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(Float maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public Float getCurrentSpeed() {
		return currentSpeed;
	}

	public void setCurrentSpeed(Float currentSpeed) {
		if (currentSpeed <= maxSpeed) {
			this.currentSpeed = currentSpeed;
		}
	}
	
	public Float getTemperature() {
		return temperature + currentSpeed/10;
	}

	
}
