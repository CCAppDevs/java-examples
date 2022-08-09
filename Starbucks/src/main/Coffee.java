package main;

public class Coffee extends Drink {

	public Coffee() {
		super();
	}

	@Override
	public double getCost() {
		return 1;
	}

	@Override
	public String getDescription() {
		return "Coffee";
	}
}
