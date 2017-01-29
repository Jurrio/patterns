package observer.system;

import java.util.ArrayList;
import java.util.List;

import observer.system.model.HardDrive;
import observer.system.model.Memory;
import observer.system.model.Network;
import observer.system.model.Processor;
import observer.system.model.Process;


public class SystemInfo implements Subject {

	private List<Observer> observers;
	private List<Process> processes;
	private Processor cpu;
	private Memory ram;
	private HardDrive hdd;
	private Network lan;
	
	public SystemInfo() {
		this.observers = new ArrayList<>();
		this.processes = new ArrayList<>();
	}
	
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		int index = observers.indexOf(o);
		if (index >= 0) {
			observers.remove(index);
		}
		
	}

	@Override
	public void notifyObservers() {
		for (Observer obs : observers) {
			obs.update();
		}
	}

	public List<Observer> getObservers() {
		return observers;
	}
	
	public void addProcess(Process p) {
		this.cpu.addProcess(p.getLoadCpu());
		this.ram.useMemory(p.getRamSpace());
		this.hdd.writeData(p.getDiskSpace());
		this.lan.setCurrentSpeed(lan.getCurrentSpeed() + p.getUseNetwork());
		notifyObservers();
	}

	public Processor getCpu() {
		return cpu;
	}

	public Memory getRam() {
		return ram;
	}

	public HardDrive getHdd() {
		return hdd;
	}

	public Network getLan() {
		return lan;
	}

	public void setObservers(List<Observer> observers) {
		this.observers = observers;
	}

	public void setCpu(Processor cpu) {
		this.cpu = cpu;
	}

	public void setRam(Memory ram) {
		this.ram = ram;
	}

	public void setHdd(HardDrive hdd) {
		this.hdd = hdd;
	}

	public void setLan(Network lan) {
		this.lan = lan;
	}
}
