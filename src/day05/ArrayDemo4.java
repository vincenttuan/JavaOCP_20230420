package day05;

import java.util.Arrays;

public class ArrayDemo4 {
	public static void main(String[] args) {
		// 分數 -1 表示缺考
		int[] scores = {100, 50, -1, 40, 77, -1, 85, -1};
		// 有考試成績的學生有幾位(不含缺考) ? 平均(不含缺考) = ?
		// Java 8 stream()
		long count = Arrays.stream(scores)
						  .filter(x -> x != -1)
						  .count();  // 注意: count() 會得到 long 而不是 int
		System.out.println(count);
		double avg = Arrays.stream(scores)
						   .filter(x -> x != -1)
						   .average() // 得到平均物件
						   .getAsDouble(); // 取出平均值資料
		System.out.println(avg);
	}
}
