package day06;

public class MultiArrayDemo2 {

	public static void main(String[] args) {
		int[][] m = {
				{100, 90},
				{85, 75, 65},
				{70, 60}
			};
		
		System.out.println(m.length);
		for(int i=0;i<m.length;i++) {
			System.out.println(m[i]); // m[i] 一維陣列
			for(int k=0;k<m[i].length;k++) {
				System.out.printf("m[%d][%d] = %d\n", i, k, m[i][k]);
			}
		}
		
	}

}
