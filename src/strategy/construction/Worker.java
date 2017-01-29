package strategy.construction;

public abstract class Worker {

	String profession;
	Skill skill;
	Tool tool;
	
	public Worker() {
	}
	
	public void doWork() {
		skill.doWork();
	}
	
	public void useTool() {
		tool.useTool();
	}
	
	public void dailyReport() {
		System.out.println("I'm " + profession);
		workTime();
		skill.doWork();
		tool.useTool();
		System.out.println();
	}
	
	public abstract void workTime();
}
