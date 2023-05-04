package day05;

import java.util.Arrays;

public class ArrayDemo2 {
	public static void main(String[] args) {
		// 分數 -1 表示缺考
		int[] scores = {100, 50, -1, 40, 70, -1, 85, -1};
		// 有考試的學生總分(不含缺考) = ?
		// for-each
		int sum = 0;
		for(int x : scores) {
			if(x != -1) {
				sum += x;
			}
		}
		System.out.println(sum);
		// Java 8 stream()
		int sum2 = Arrays.stream(scores)
						 .filter(x -> x != -1)
						 .sum(); // 自動將元素加總
		System.out.println(sum2);
	}
}
