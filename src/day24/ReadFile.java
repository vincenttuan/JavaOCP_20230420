package day24;

import java.io.File;

public class ReadFile {

	public static void main(String[] args) {
		File file = new File("src/day24/employee.txt");
		// 檔案是否存在 ?
		if(file.exists()) {
			System.out.println("檔案存在");
		} else {
			System.out.println("檔案不存在");
		}

	}

}
