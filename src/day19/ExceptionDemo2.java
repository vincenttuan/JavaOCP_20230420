package day19;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		play();
	}
	
	public static void play() {
		// BMI 計算系統
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("請輸入身高cm: ");
			double h = scanner.nextDouble();
			System.out.print("請輸入體重kg: ");
			double w = scanner.nextDouble();
			double bmi = w/Math.pow(h/100, 2);
			System.out.printf("BMI = %.2f\n", bmi);
		} catch (InputMismatchException e) {
			System.out.println("輸入資料不正確請重新輸入");
			play(); // 遞迴呼叫
		}
		
	}
	

}
