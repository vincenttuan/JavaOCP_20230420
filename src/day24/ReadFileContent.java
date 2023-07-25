package day24;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//讀取檔案內容
public class ReadFileContent {

	public static void main(String[] args) throws IOException {
		// 判斷指定檔案是否存在 ?
		File file = new File("src/day24/employee.txt");
		if(!file.exists()) {
			System.out.println(file.getName() + " 檔案不存在, 程式結束!");
			System.exit(1); // 1: 表示人為停止系統
		}
		
		// 讀取檔案內容
		FileReader fr = new FileReader(file);
		int word = 0; // 每一個讀到的字
		StringBuilder sb = new StringBuilder(); // 利用 sb 來收集每一個字
		while((word = fr.read()) != -1) {
			//System.out.print(word);
			//System.out.print((char)word);
			sb.append((char)word);
		}
		System.out.println(sb.length());
		System.out.println(sb);
		
		

	}

}
