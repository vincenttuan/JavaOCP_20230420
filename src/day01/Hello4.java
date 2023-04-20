package day01;

public class Hello4 {

	public static void main(String[] args) {
		// 計算 BMI part I
		calcAndPrintBMI(170, 60);
		calcAndPrintBMI(165, 52.5);
		calcAndPrintBMI(180.2, 75);
		// 計算 BMI part II
		calcBMI(170, 60);
		calcBMI(165, 52.5);
		calcBMI(180.2, 75);
	}
	
	public static void calcAndPrintBMI(double h, double w) {
		double bmi = w / Math.pow(h/100, 2);
		System.out.printf("BMI: %.2f\n", bmi);
	}
	
	public static void calcBMI(double h, double w) {
		// 計算 bmi
		double bmi = w / Math.pow(h/100, 2);
		// 計算完成之後調用 printBMI(bmi) 方法列印 bmi 資料
		printBMI(bmi);
	}
	
	public static void printBMI(double bmi) {
		System.out.printf("BMI: %.2f\n", bmi);
	}
	
	
}
