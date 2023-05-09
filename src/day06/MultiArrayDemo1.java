package day06;

import java.util.Arrays;

public class MultiArrayDemo1 {

	public static void main(String[] args) {
		// 一維陣列
		int[] n = {100, 90, 80};
		// 對稱型-二維陣列
		int[][] m = {
						{100, 90, 80}, 
						{70, 60, 50}
					};
		
		System.out.println(n);
		System.out.println(m);
		System.out.println(Arrays.toString(n));
		System.out.println(Arrays.toString(m));
		System.out.println(Arrays.toString(m[0]));
		System.out.println(Arrays.toString(m[1]));
		System.out.println(m.length);
		System.out.println(m[0].length);
		System.out.println(m[1].length);
	}

}
