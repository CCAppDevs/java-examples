package main;

public class Mocha extends CondimentDecorator {
	private final Drink drink;

	public Mocha(Drink drink) {
		super();
		this.drink = drink;
	}

	@Override
	public String getDescription() {
		return this.drink.getDescription() + ", Mocha";
	}

	@Override
	public double getCost() {
		return 0.20 + this.drink.getCost();
	}
}
