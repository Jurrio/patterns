package strategy.construction;

public class Admin extends Worker{

	public Admin() {
		profession = "Admin";
		tool = new Winbox();
		skill = new MicroticSetting();
	}

	@Override
	public void workTime() {
		System.out.println("I'm work from 11 a.m. to 7 p.m.");
		
	}
		
	
}
