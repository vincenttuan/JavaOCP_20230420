package day18;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

// 利用 Map 進行群組與分類 + 排序 (必考)
public class MapGroupDemo2 {
	
	public static void main(String[] args) {
		List<String> fruits = Arrays.asList(
				"apple", "mango", "banana", "papaya", "orange",
				"apple", "mango", "apple", "apple", "orange",
				"pineapple", "banana", "mango"); 
		
		// 請問每一種水果各有幾個 ? 並且要依照數量由大到小排序
		// apple=4, mango=3, banana=2, orange=2, papaya=1, pineapple=1
		
		Map<String, Long> unsortedMap = fruits.stream()
				   .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(unsortedMap); // 只有分類但尚未排序
		
		
		
	}
	
}
