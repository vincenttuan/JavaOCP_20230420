package day05;

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
		
	}
}
