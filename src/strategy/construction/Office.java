package strategy.construction;

public class Office {

	public static void main(String[] args) {

		Worker developer = new Developer();
		Worker qa = new AutomationQA();
		Worker admin = new Admin();
		Worker manager = new Manager();
		
		developer.dailyReport();
		qa.dailyReport();
		admin.dailyReport();
		manager.dailyReport();
	}
}
