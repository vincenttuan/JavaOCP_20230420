package day05;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class ArrayDemo7 {

	public static void main(String[] args) {
		String[] names = {"John", "Vincent", null, "Anita", "Jo", null};
		// 題目:計算每個有效名字的字母總和與平均 (使用 Java 8 stream)
		IntSummaryStatistics stat = Arrays.stream(names)  // {"John", "Vincent", null, "Anita", "Jo", null}
										  .filter(x -> x != null)  // {"John", "Vincent", "Anita", "Jo"}
										  .mapToInt(x -> x.length()) // {4, 7, 5, 2}
										  .summaryStatistics();
		System.out.println(stat.getSum());
		System.out.println(stat.getAverage());
		System.out.println(stat);
	}

}
