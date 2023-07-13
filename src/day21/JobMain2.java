package day21;

import java.util.Date;
import java.util.Random;

// 使用 Java 8 Lambda 撰寫執行緒
public class JobMain2 {
	public static void main(String[] args) {
		// 取得現在時間的工作
		Runnable jobTime = () -> System.out.println(new Date());
		// 取得開獎號碼的工作
		Runnable jobLotto = () -> {
			Random random = new Random();
			int lottoNumber = random.nextInt(99) + 1; // 1~99
			System.out.println(lottoNumber);
		};
		// 建立執行緒
		Thread t1 = new Thread(jobTime, "現在時間");
		Thread t2 = new Thread(jobLotto, "開獎號碼");
		// 啟動執行緒
		t1.start();
		t2.start();
		
		
		
	}
}
