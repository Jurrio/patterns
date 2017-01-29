package strategy.ducks;

public class MallardDuck extends Duck {

	public MallardDuck() {
		this.flyBehavior = new FlyWithWings();
		this.quackBehavior = new Quack();
	}

	@Override
	public void swim() {
		System.out.println("I'm swim!");
	}

	@Override
	public void display() {
		System.out.println("I'm a real Mallard duck!");
	}

	
}
