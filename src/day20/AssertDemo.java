package day20;

public class AssertDemo {

	public static void main(String[] args) {
		
		// 考試的時候會考如何讓 assert 能有功效
		// 在執行程式的時候必須下達 -ea
		
		int x = 70;
		assert(x >= 60): "不及格";
		
		System.out.println("及格");

	}

}
