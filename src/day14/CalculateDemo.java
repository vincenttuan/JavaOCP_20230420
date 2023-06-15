package day14;

public class CalculateDemo {

	public static void main(String[] args) {
		Calculate calcAdd = new CalculateAdd();
		System.out.println(calcAdd.operation(10, 20));
		
		Calculate calcSub = new CalculateSub();
		System.out.println(calcSub.operation(10, 20));

	}

}
