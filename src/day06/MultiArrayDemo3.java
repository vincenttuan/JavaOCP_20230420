package day06;

public class MultiArrayDemo3 {

	public static void main(String[] args) {
		int[][] mm = {
				{100, 90},
				{85, 75, 65},
				{70, 60}
			};
		// for-each 來抓取每一筆資料
		for(int[] m : mm) {
			for(int x : m) {
				System.out.println(x);
			}
		}

	}

}
