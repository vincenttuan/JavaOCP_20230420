package day03;
import java.util.Arrays;
public class ArraysDemo4 {

	public static void main(String[] args) {
		int[] scores = {100, 90, 83, 70, 60};
		// 1. 快速印出陣列內容
		System.out.println(Arrays.toString(scores));
		
		int length = scores.length; // 陣列長度
		
		// 2. 請計算總分
		//int sum = scores[0] + scores[1] + scores[2] + scores[3] + scores[4]; 
		int sum = 0;
		for(int i=0;i<length;i++) {
			sum += scores[i]; // sum = sum + scores[i];
		}
		System.out.printf("總分: %d\n", sum);
		
		// 3. 請計算平均(整數)
		int avg = sum / length;
		System.out.printf("平均: %d\n", avg);
		
		// 4. 請計算平均(浮點數)
		double avg2 = (double)sum / length;
		System.out.printf("平均: %.1f\n", avg2);
	}

}
