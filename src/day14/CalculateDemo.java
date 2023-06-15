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
		Calculate calcDiv1 = (double x, double y) -> { 
			return x / y;
		};
		
		// 利用 Lambda 語法(簡化寫法)
		Calculate calcDiv2 = (x, y) -> x / y;
		
		// 利用 Lambda 語法(簡化寫法) - BMI 計算
		Calculate calcBMI = (h, w) -> w / Math.pow(h/100, 2);
		
		// 利用 Lambda 語法(簡化寫法) - x 的 y 次方
		
		
		System.out.println(calcDiv1.operation(10, 20));
		System.out.println(calcDiv2.operation(10, 20));
		System.out.println(calcBMI.operation(170, 60));
		
		
	}

}
