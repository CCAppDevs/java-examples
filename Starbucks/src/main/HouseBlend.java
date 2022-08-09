package main;

public class HouseBlend extends Drink {

	public HouseBlend() {
		super();
	}

	@Override
	public double getCost() {
		return 1.25;
	}

	@Override
	public String getDescription() {
		return "House Blend";
	}

}
