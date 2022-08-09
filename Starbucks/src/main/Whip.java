package main;

public class Whip extends CondimentDecorator {
	private final Drink drink;

	public Whip(Drink drink) {
		super();
		this.drink = drink;
	}

	@Override
	public String getDescription() {
		return this.drink.getDescription() + ", whip";
	}

	@Override
	public double getCost() {
		return 0.15 + this.drink.getCost();
	}
}
