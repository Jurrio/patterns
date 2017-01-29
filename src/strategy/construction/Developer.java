package strategy.construction;

public class Developer extends Worker{

	public Developer() {
		profession = "Developer";
		tool = new Eclipse();
		skill = new JavaProgramming();
	}

	@Override
	public void workTime() {
		System.out.println("I'm work from 9 p.m. to 6 a.m.");		
	}
	

}
