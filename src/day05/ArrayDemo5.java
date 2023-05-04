package day05;

import java.util.Arrays;

public class ArrayDemo5 {
	public static void main(String[] args) {
		String[] names = {"John", "Vincent", "Anita", "Jo"};
		//System.out.println(names.length);
		// 計算名字的平均字母有幾個
		int[] words = new int[names.length];
		
		for(int i=0;i<names.length;i++) {
			words[i] = names[i].length();
		}
		System.out.println(Arrays.toString(names));
		System.out.println(Arrays.toString(words));
		// 計算 words 陣列的平均
		int sum = 0;
		for(int x : words) {
			sum += x;
		}
		double avg = (double)sum / words.length;
		System.out.println(avg);
		
		
		
	}
}
