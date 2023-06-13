package day13;

public class SugarDecorator implements BeverageDecorator {
	private AbstractBeverage beverage;
	
	public SugarDecorator(AbstractBeverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getName() {
		return "黑糖";
	}

	@Override
	public double getCost() {
		return beverage.getCost() + 7;
	}
	
}
