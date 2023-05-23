package day07;

import java.util.Arrays;

public class BreadMain {
	public static void main(String[] args) {
		Bread.pricePerGram = 8;
		
		Bread b1 = new Bread();
		b1.type="法國麵包";b1.weight=100;
		Bread b2 = new Bread();
		b2.type="小餐包";b2.weight=5;
		Bread b3 = new Bread();
		b3.type="油條麵包";b3.weight=15;
		
		// 請問我要買 3 個法國麵包, 2 個小餐包, 4 個油條麵包 共需要多少錢 ?
		Bread[] breads = {b1, b1, b1, b2, b2, b3, b3, b3, b3};
		int sum = 0;
		for(Bread bread: breads) {
			sum += bread.getPrice();
		}
		System.out.println(sum);
		
		// java 8		
		int sum2 = Arrays.stream(breads)
						 .mapToInt(bread -> bread.getPrice())
						 .sum();
		System.out.println(sum2);
		
		
	}
}
