package observer.system;

import observer.system.model.HardDrive;
import observer.system.model.Memory;
import observer.system.model.Network;
import observer.system.model.Process;
import observer.system.model.Processor;

public class Computer {
		
	public static void main(String[] args) {
		SystemInfo info = new SystemInfo();
		Observer taskManager = new TaskManager(info);
		Observer diagnosticManager = new DiagnosticManager(info);
		Observer diskManager = new DiskManager(info);
		info.setCpu(new Processor(2700));
		info.setRam(new Memory(8192));
		info.setHdd(new HardDrive(1000f));
		info.setLan(new Network(100));
		
		
		
		Process process1 = new Process(120f, 2048L, 900, 15f);
		info.addProcess(process1);
		
		Process process2 = new Process(178f, 1000L, 1578, 65f);
		info.addProcess(process2);
	
	}

}
