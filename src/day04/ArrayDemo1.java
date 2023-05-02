package day04;

import java.util.Arrays;

public class ArrayDemo1 {

	public static void main(String[] args) {
		int[] scores = {100, 90, 80};
		System.out.println(scores.length); // scores 的陣列長度
		// 手動各別印出每一個陣列裡的元素
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		// 透過 for-loop 印出每一個陣列裡的元素 part I
		for(int i=0;i<scores.length;i++) {
			System.out.println(scores[i]);
		}
		// 透過 for-loop 印出每一個陣列裡的元素 part II
		for(int i=0, lens=scores.length ; i < lens ; i++) {
			System.out.println(scores[i]);
		}
		// 透過 for-each(for-in) 印出每一個陣列裡的元素 part III
		for(int x : scores) {
			System.out.println(x);
		}
		// 透過 Arrays.toString(陣列名);
		System.out.println(Arrays.toString(scores));
	}

}
