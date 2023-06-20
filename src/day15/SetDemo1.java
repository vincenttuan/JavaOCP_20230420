package day15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo1 {

	public static void main(String[] args) {
		Set set = new LinkedHashSet();
		set.add("國文"); // 元素型別 String 
		set.add(100);  // 元素型別 Integer 
		set.add("數學"); // 元素型別 String
		set.add(null); // 空元素 null
		set.add(Integer.valueOf(85)); // 元素型別 Integer
		set.add("英文"); // 元素型別 String
		set.add(78); // 元素型別 Integer
		
		System.out.println(set);
		
		// 尋訪元素
		Iterator iter = set.iterator(); // 尋訪器(迭代器)
		while(iter.hasNext()) {
			Object value = iter.next();
			if(value != null) {
				System.out.println(value + ", " + value.getClass().getSimpleName());
			} else {
				System.out.println(value);
			}
		}
		
		// 請計算出 set 集合中所有分數的總和 = ?
		iter = set.iterator();
		int sum = 0;
		while(iter.hasNext()) {
			Object value = iter.next();
			if(value != null && value.getClass().getSimpleName().equals("Integer")) {
				sum += (Integer)value;
			}
		}
		System.out.println("sum = " + sum);
		
		// 請計算出 set 集合中所有分數的總和 = ?
		iter = set.iterator();
		sum = 0;
		while(iter.hasNext()) {
			Object value = iter.next();
			if(value instanceof Integer) {
				sum += (Integer)value;
			}
		}
		System.out.println("sum = " + sum);
	}

}
