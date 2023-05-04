package day05;

import java.util.Arrays;

public class ArrayDemo1 {

	public static void main(String[] args) {
		int[] scores = {100, 50, 40, 70, 85};
		// 請印出及格的分數
		// for-each
		for(int x : scores) {
			if(x >= 60) { // 過濾 x 資料
				System.out.println(x);
			}
		}
		System.out.println("------");
		// Java 8 Arrays.stream()
		Arrays.stream(scores)  // 將 int[] 串流化為 IntStream
			  .filter(x -> x >= 60) // 過濾 x 資料
			  .forEach(x -> System.out.println(x));
		
	}

}
