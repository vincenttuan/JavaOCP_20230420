package day05;

public class ArrayDemo1 {

	public static void main(String[] args) {
		int[] scores = {100, 50, 40, 70, 85};
		// 請印出及格的分數
		// for-each
		for(int x : scores) {
			if(x >= 60) {
				System.out.println(x);
			}
		}
		
	}

}
