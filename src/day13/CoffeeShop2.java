package day13;

public class CoffeeShop2 {

	public static void main(String[] args) {
		Beverage coffee = new Coffee("咖啡", 50);
		coffee = new MilkDecorator((AbstractBeverage)coffee);
		
		System.out.printf("%s $%.1f\n", coffee.getName(), coffee.getCost());

	}

}
