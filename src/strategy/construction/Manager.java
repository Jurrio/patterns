package strategy.construction;

public class Manager extends Worker {

	public Manager() {
		profession = "Project Manager";
		skill = new TeamManagement();
		tool = new Jira();
	}

	@Override
	public void workTime() {
		System.out.println("I'm work from 9 a.m. to 5 p.m.");
	}
	

}
