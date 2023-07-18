package day22;

import java.util.Random;

public class Lottery {
	static int lottoNumber;
	public static void main(String[] args) throws InterruptedException {
		// 主執行緒公布獎號
		// 子1執行緒負責開場
		// 子2執行緒負責搖獎
		Runnable r1 = () -> System.out.println("子1-開場...");
		Runnable r2 = () -> {
			System.out.println("子2-搖獎開始");
			lottoNumber = new Random().nextInt(100);
			System.out.println("子2-搖獎結束");
		};
		
		Thread t1 = new Thread(r1);
		t1.start();
		
		t1.join();
		
		Thread t2 = new Thread(r2);
		t2.start();
		
		t2.join();
		
		System.out.println("主-開獎號碼:" + lottoNumber);
	}

}
