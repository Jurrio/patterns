package observer.system.model;

public class Process {
	
	private Float diskSpace;
	private Long ramSpace;
	private Integer loadCpu;
	private Float useNetwork;

	public Process(Float diskSpace, Long ramSpace, Integer loadCpu, Float useNetwork) {
		this.diskSpace = diskSpace;
		this.ramSpace = ramSpace;
		this.loadCpu = loadCpu;
		this.useNetwork = useNetwork;
	}

	public Float getDiskSpace() {
		return diskSpace;
	}

	public void setDiskSpace(Float diskSpace) {
		this.diskSpace = diskSpace;
	}

	public Long getRamSpace() {
		return ramSpace;
	}

	public void setRamSpace(Long ramSpace) {
		this.ramSpace = ramSpace;
	}

	public Integer getLoadCpu() {
		return loadCpu;
	}

	public void setLoadCpu(Integer loadCpu) {
		this.loadCpu = loadCpu;
	}

	public Float getUseNetwork() {
		return useNetwork;
	}

	public void setUseNetwork(Float useNetwork) {
		this.useNetwork = useNetwork;
	}
	
}
