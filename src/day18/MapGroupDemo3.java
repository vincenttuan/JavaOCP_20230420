package day18;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapGroupDemo3 {

	public static void main(String[] args) {
		List<Fruit> fruits = Arrays.asList(
				new Fruit("apple",     10, 9.99),  // 箱
				new Fruit("mango",     20, 29.99),
				new Fruit("banana",    10, 19.99),
				new Fruit("papaya",    10, 19.99),
				new Fruit("orange",    20, 29.99),
				new Fruit("apple",     20, 9.99),
				new Fruit("mango",     10, 29.99),
				new Fruit("apple",     10, 9.99),
				new Fruit("apple",     30, 9.99),
				new Fruit("orange",    10, 29.99),
				new Fruit("pineapple", 20, 19.99),
				new Fruit("banana",    20, 19.99),
				new Fruit("mango",     10, 29.99)
		);
		
		// 每一種水果各有幾箱 ?
		Map<String, Long> map1 = fruits.stream()
				.collect(Collectors.groupingBy(Fruit::getName, Collectors.counting()));
		System.out.println(map1);
		
		// 每一種水果各有顆/個 ?
		
	}

}
