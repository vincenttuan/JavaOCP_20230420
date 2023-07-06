package day19;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo4 {

	public static void main(String[] args) {
		play();
	}
	
	public static void play() {
		// BMI 計算系統(重構/優化後)
		Scanner scanner = new Scanner(System.in);
		double h = getInputData(scanner, "請輸入身高cm:", "身高輸入錯誤,請重新輸入");	
		double w = getInputData(scanner, "請輸入體重kg:", "體重輸入錯誤,請重新輸入");
		double bmi = w/Math.pow(h/100, 2);
		System.out.printf("BMI = %.2f\n", bmi);
	}
	
	public static double getInputData(Scanner scanner, String message, String errorMessage) {
		while (true) {
			try {
				System.out.print(message);
				return scanner.nextDouble();
			} catch (InputMismatchException e) {
				scanner.nextLine(); // 取得新的一行資料
				System.out.println(errorMessage);
				continue;
			}
		}
	}

}
