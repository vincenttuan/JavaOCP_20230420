package day05;

import java.util.Arrays;
import java.util.OptionalDouble;

public class OptionalDemo {

	public static void main(String[] args) {
		// Optional 可能包含也可能不包含容器
		// -1 表示缺考
		int[] scores = {40, -1, 50, 35, -1};
		// 請計算出及格分數的平均值(不含缺考)
		int count = 0;
		int sum = 0;
		for(int x : scores) {
			if(x != -1 && x >= 60) {
				count++;
				sum+=x;
			}
		}
		double avg = (double)sum / count;
		System.out.println(avg); // NaN: Not a Number
		// Java 8 stream() + Optional
		
		OptionalDouble optAvg = Arrays.stream(scores)
			  						  .filter(x -> x != -1 && x >= 60)
			  						  .average();
		if(optAvg.isPresent()) { // OptionalDouble 容器內是否有資料 ?
			System.out.println(optAvg.getAsDouble()); // 將資料取出
		} else {
			System.out.println("平均資料不存在");
		}

	}

}
