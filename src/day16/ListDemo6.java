package day16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ListDemo6 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 2, 1);
		System.out.println(list);
		
		// 請刪除重複項, 使之變成 1, 2, 3
		Set<Integer> ans = new LinkedHashSet<>(list);
		System.out.println(ans);
		
		list = new ArrayList<>(ans);
		System.out.println(list);
	}
}
