package strategy.construction;

public class AutomationQA extends Worker {

	public AutomationQA() {
		profession = "QA Tester";
		tool = new Selenium();
		skill = new JavaProgramming();
	}

	@Override
	public void workTime() {
		System.out.println("I'm work from 9 a.m. to 5 p.m.");		
	}


}
