package day16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo3 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3); // Integer.valueOf(3)
		list.add(4);
		list.add(5);
		System.out.println(list);
		
		// 將可變集合轉為不可修改集合
		//list = Collections.unmodifiableList(list);
				
		//list.remove(3); 3 是表示 index
		list.remove(Integer.valueOf(3)); // Integer.valueOf(3) 表示元素內容
		System.out.println(list);
		
		System.out.println(Collections.max(list));
		Collections.reverse(list); // 反轉
		System.out.println(list);
	}

}
