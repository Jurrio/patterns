package observer.system;

public class DiagnosticManager implements Observer, DisplayInfo{
	
	private Float temperatureCpu;
	private Float temperatureHdd;
	private Float temperatureRam;
	private Float temperatureLan;
	Subject subject;
	
	public DiagnosticManager(Subject subj) {
		this.subject = subj;
		subject.registerObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("Temperature: CPU - " + temperatureCpu + "C; HDD - " + temperatureHdd + "; RAM - " + temperatureRam + "; LAN - " + temperatureLan);
		
	}
	@Override
	public void update() {
		if (subject instanceof SystemInfo) {
			SystemInfo info = (SystemInfo) subject;
			temperatureCpu = info.getCpu().getTemperature();
			temperatureHdd = info.getHdd().getTemperature();
			temperatureRam = info.getRam().getTemperature();
			temperatureLan = info.getLan().getTemperature();
			display();
		}
		
	}
	

}
