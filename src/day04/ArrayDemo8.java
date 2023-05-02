package day04;

import java.util.Arrays;

public class ArrayDemo8 {
	public static void main(String[] args) {
		int[] scores = {100, 80, 70};
		// 逐一印出每一個元素(for-each / for-in)
		for(int score : scores) {
			System.out.println(score);
		}
		
		// 可以透過 Arrays.stream() 的 forEach() 方法來尋訪元素
		Arrays.stream(scores).forEach(score -> System.out.println(score));
		// 透過 :: (方法參考)
		Arrays.stream(scores).forEach(System.out::println); // 簡化寫法
		
	}
}
