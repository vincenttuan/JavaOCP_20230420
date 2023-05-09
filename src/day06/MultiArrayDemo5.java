package day06;

public class MultiArrayDemo5 {

	public static void main(String[] args) {
		// 有三組{身高, 體重}的組合
		double[][] mm = {
				{170, 60},
				{180, 80},
				{165, 55}
			};
		// 請求出每一組的 bmi 資料
		for(double[] m : mm) {
			double h = m[0]; // 身高
			double w = m[1]; // 體重
			double bmi = w / Math.pow(h/100, 2);
			System.out.printf("h=%.1f w=%.1f bmi=%.1f\n", h, w, bmi);
		}
	}

}
