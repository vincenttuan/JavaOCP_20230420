package day06;

import java.util.Arrays;

public class MultiArrayDemo6 {

	public static void main(String[] args) {
		// 有三個員工的{時薪,加班時數}如下
		double [][] employeeData = {
				{150, 3},
				{200, 4},
				{100, 6}
		};
		// 請問公司總共要給付多少加班費用 ?
		int sum = 0;
		for(double[] emp : employeeData) {
			double fee = emp[0] * emp[1];
			//System.out.println(fee);
			sum += fee;
		}
		System.out.println(sum);
		// 使用 java 8 stream
		double sum2 = Arrays.stream(employeeData)
						 .mapToDouble(emp -> emp[0] * emp[1]) // 450, 800, 600
						 .sum();
		System.out.println(sum2);
	}

}
