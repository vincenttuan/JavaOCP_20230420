package day04;

public class Util {
	// 專門計算 double[] 平均的方法
	public static double getAvg(double[] items) {
		double sum = 0;
		for (double item : items) {
			sum += item;
		}
		double avg = sum / items.length;
		return avg;
	}
}
