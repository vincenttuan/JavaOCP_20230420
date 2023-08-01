package day26;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

// 批次新增
public class AddBatchStudent {

	public static void main(String[] args) throws IOException {
		// 1. 讀取 score.txt 的檔案內容
		Path filePath = Paths.get("src/day26/score.txt");
		List<String> lines = Files.readAllLines(filePath);
		System.out.println("資料筆數: " + lines.size());
		System.out.println("資料內容: " + lines);
		
		
	}

}

