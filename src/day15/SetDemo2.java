package day15;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo2 {
	public static void main(String[] args) {
		
		Set<Integer> set = new LinkedHashSet<>();
		set.add(100);
		set.add(90);
		set.add(80);
		set.add(100); // 元素重複
		System.out.println(set);
		
		// 計算總和
		Iterator<Integer> iter = set.iterator();
		int sum = 0;
		while (iter.hasNext()) {
			sum += iter.next();
		}
		System.out.println("sum = " + sum);
		
		
	}
}
