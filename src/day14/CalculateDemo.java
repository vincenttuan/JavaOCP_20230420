package day14;

public class CalculateDemo {

	public static void main(String[] args) {
		Calculate calcAdd = new CalculateAdd();
		System.out.println(calcAdd.operation(10, 20));
		
		Calculate calcSub = new CalculateSub();
		System.out.println(calcSub.operation(10, 20));
		
		// 利用匿名內部類別技巧
		Calculate calcMulti = new Calculate() {
			
			@Override
			public double operation(double x, double y) {
				return x * y;
			}
			
		};
		System.out.println(calcMulti.operation(10, 20));
		
		// 利用 Lambda 語法
		Calculate calcDiv = (double x, double y) -> x / y;
		System.out.println(calcDiv.operation(10, 20));
		
		
	}

}
