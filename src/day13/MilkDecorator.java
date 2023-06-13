package day13;

public class MilkDecorator implements BeverageDecorator {
	private AbstractBeverage beverage; // 裝飾目標
	
	public MilkDecorator(AbstractBeverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getName() {
		return beverage.getName() + "牛奶";
	}

	@Override
	public double getCost() {
		return beverage.getCost() + 10.0;
	}
	
}
