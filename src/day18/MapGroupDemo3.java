package day18;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summingLong;
import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.toSet;

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
				.collect(groupingBy(Fruit::getName, counting()));
		System.out.println(map1);
		
		// 每一種水果各有顆/個 ?
		Map<String, Long> map2 = fruits.stream()
				.collect(groupingBy(Fruit::getName, summingLong(Fruit::getQty)));
		System.out.println(map2);
		
		// 每一個價位各有哪些水果 ?
		// 9.99=[apple], 19.99=[banana, papaya, pineapple], 29.99=[mango, orange]
		// 先根據 price 分類
		Map<Double, List<Fruit>> groupByPrice = fruits.stream()
				.collect(groupingBy(Fruit::getPrice));
		System.out.println(groupByPrice);
		
		Map<Double, String> groupByPrice2 = fruits.stream()
				.collect(groupingBy(Fruit::getPrice, mapping(Fruit::getName, joining(", "))));
		System.out.println(groupByPrice2);
		
		Map<Double, String> groupByPrice3 = fruits.stream()
				.collect(groupingBy(Fruit::getPrice, 
									mapping(Fruit::getName, collectingAndThen(toSet(), names -> String.join(", ", names)))));
		System.out.println(groupByPrice3);
		
		Map<Double, Set<String>> groupByPrice4 = fruits.stream()
													   .collect(groupingBy(Fruit::getPrice, 
															   			   mapping(Fruit::getName, toSet())));
		System.out.println(groupByPrice4);
	}

}
