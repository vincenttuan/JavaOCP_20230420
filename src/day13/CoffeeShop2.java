package day13;

public class CoffeeShop2 {

	public static void main(String[] args) {
		Beverage coffee = new Coffee("咖啡", 50);
		coffee = new MilkDecorator(coffee);
		coffee = new SugarDecorator(coffee);
		
		System.out.printf("%s $%.1f\n", coffee.getName(), coffee.getCost());
		
		Beverage tea = new Tea("紅茶", 15);
		tea = new MilkDecorator(tea);
		tea = new SugarDecorator(tea);
		
		System.out.printf("%s $%.1f\n", tea.getName(), tea.getCost());
		
	}

}
