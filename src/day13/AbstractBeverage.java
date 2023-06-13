package day13;

public abstract class AbstractBeverage implements Beverage {
	private String name;
	private double cost;
	
	public AbstractBeverage(String name, double cost) {
		this.name = name;
		this.cost = cost;
	}
	
}
