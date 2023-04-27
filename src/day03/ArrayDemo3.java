package day03;
import java.util.Arrays;
public class ArrayDemo3 {

	public static void main(String[] args) {
		int[] scores = {100, 90, 80, 70, 60};
		
		for(int i=0;i<scores.length;i++) {
			System.out.println(scores[i]);
		}
		
		for(int i=0, length=scores.length; i < length  ;  i++  ) {
			System.out.println(scores[i]);
		}
		
		// 快速法
		// 透過 Arrays.toString(一維陣列) 將資料印出
		System.out.println( Arrays.toString(scores) );

	}

}
