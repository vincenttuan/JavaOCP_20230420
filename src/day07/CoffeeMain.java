package day07;

public class CoffeeMain {

	public static void main(String[] args) {
		Coffee c1 = new Coffee();
		c1.brand="藍山咖啡";c1.temperature=60;c1.price=90;
		Coffee c2 = new Coffee();
		c2.brand="摩卡咖啡";c2.temperature=40;c2.price=65;
		Coffee c3 = new Coffee();
		c3.brand="冰滴咖啡";c3.temperature=2;c3.price=120;
		
		// 請求出咖啡平均價格 ?
		Coffee[] coffees = {c1, c2, c3};
		int avg = 0;
		int sum = 0;
		for(Coffee coffee : coffees) { // for-each
			sum += coffee.price;
		}
		avg = sum / coffees.length;
		System.out.println(avg);
		
		// 請求出熱咖啡與冰咖啡的平均價格各為多少 ?
		
	}

}
