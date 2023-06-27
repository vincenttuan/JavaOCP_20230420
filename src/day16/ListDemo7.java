package day16;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ListDemo7 {
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> list2 = Arrays.asList(4, 5, 6, 7, 8);
		System.out.println(list1);
		System.out.println(list2);
		
		// 請將受歡迎的商品找出 (product1 與 product2 都有的商品 交集)
		Set<Integer> intersection = new LinkedHashSet<>(list1);
		intersection.retainAll(list2);
		System.out.println(intersection); // [4, 5]
		
		// 請將所有有購買的商品找出(不重複) (product1 與 product2 聯集)
		
		
	}
}
