package day02;

// 咖啡店
public class CoffeeStore {

	public static void main(String[] args) {
		int total = 0;
		// 設定牛奶比例
		Coffee.changeRatioOfMilk(0);
		System.out.println(Coffee.price);
		total += Coffee.price;
		// 印出咖啡商品資料
		Coffee.printCoffee();
		
		// 設定牛奶比例
		Coffee.changeRatioOfMilk(0.3);
		System.out.println(Coffee.price);
		total += Coffee.price;
		// 印出咖啡商品資料
		Coffee.printCoffee();

		// 設定牛奶比例
		Coffee.changeRatioOfMilk(0.7);
		System.out.println(Coffee.price);
		total += Coffee.price;
		// 印出咖啡商品資料
		Coffee.printCoffee();
		
		// 請問上面的三杯咖啡總共多少錢 ?
		System.out.printf("Total: %d\n", total);
		
		
		System.out.println(Math.round(4.5)); // 四捨五入
		System.out.println(Math.ceil(4.1)); // 無條件進入
		System.out.println(Math.floor(4.9)); // 無條件捨去
		
	}

}
