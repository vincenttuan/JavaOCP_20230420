package day12;

import java.util.Arrays;

public class AutoBoxingUnBoxing {

	public static void main(String[] args) {
		Integer a = 20; // auto-boxing: Integer.valueOf(20)
		int b = 10;
		int c = a + b; // auto-unboxing: a.intValue() + b 
		System.out.printf("a=%d b=%d c=%d\n", a.intValue(), b, c);
		System.out.printf("a=%d b=%d c=%d\n", a, b, c); // auto-unboxing: a.intValue()
		
		int[] nums = {10, 20, 30};
		int numsSum = Arrays.stream(nums)  // 得到 IntStream (int 串流)
							.sum(); // 總和
		System.out.println(numsSum);
		
		Integer[] scores = {10, 20, 30}; // {Integer.valueOf(10), Integer.valueOf(20), Integer.valueOf(30)}
		int scoresSum = Arrays.stream(scores) // 得到 Stream (一般物件串流)
							  //.mapToInt(score -> score.intValue()) // 得到 IntStream (int 串流) 
							  //.mapToInt(score -> score) // 得到 IntStream (int 串流) + auto-unboxing 
							  .mapToInt(Integer::intValue) // 得到 IntStream (int 串流) + :: (方法參考) 
							  .sum(); // 總和	
		System.out.println(scoresSum);
	}

}
