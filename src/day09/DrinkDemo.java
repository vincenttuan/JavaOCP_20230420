package day09;

import java.util.Arrays;

import org.w3c.dom.ls.LSOutput;

public class DrinkDemo {

	public static void main(String[] args) {
		Drink drink1 = new Drink("無糖綠", 35, 500, true);
		Drink drink2 = new Drink("黑咖啡", 55, 500, true);
		Drink drink3 = new Drink("古早味紅茶", 40, 700, false);
		Drink drink4 = new Drink("蘋果汁", 50, 500, false);
		Drink drink5 = new Drink("氣泡水", 20, 700, true);
		
		Drink[] drinks = {drink1, drink2, drink3, drink4, drink5};
		// 折扣前的資料依序印出
		System.out.println("折扣前的資料依序印出:");
		Arrays.stream(drinks).forEach(System.out::println);
		
		// 若要將價格都要打 8 折, 則 Drink 要如何設計一個商業方法可以滿足此需求 ?
		
		
		// 若是無糖飲料可以少5元
		
	}

}
