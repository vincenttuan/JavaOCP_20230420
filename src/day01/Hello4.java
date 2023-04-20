package day01;

public class Hello4 {

	public static void main(String[] args) {
		// 計算 BMI
		calcAndPrintBMI(170, 60);
		calcAndPrintBMI(165, 52.5);
		calcAndPrintBMI(180.2, 75);

	}
	
	public static void calcAndPrintBMI(double h, double w) {
		double bmi = w / Math.pow(h/100, 2);
		System.out.printf("BMI: %.2f\n", bmi);
	}

}
