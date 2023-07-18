package day22;

import java.util.Random;

public class Lottery2 {
	
	static int lottoNumber;
	
	class ThreadA extends Thread {
		@Override
		public void run() {
			System.out.println("T1-開場");
			
			// 啟動搖獎的執行緒
			ThreadB t2 = new ThreadB();
			t2.start();
			
			try {
				// 等待搖獎執行緒做完
				t2.join();
			} catch (Exception e) {
			}
			
			System.out.println("T1-公布獎號:" + lottoNumber);
		}
	}
	
	class ThreadB extends Thread {
		@Override
		public void run() {
			System.out.println("T2-搖獎開始");
			lottoNumber = new Random().nextInt(100);
			System.out.println("T2-搖獎結束");
		}
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		// 主執行緒負責印出"開始"與"結束"
		// 子1執行緒負責印出"開場"與"公布獎號"
		// 子2執行緒負責"搖獎"
		System.out.println("主-開始");
		
		// 遊戲開始
		ThreadA t1 = new Lottery2().new ThreadA();
		t1.start();
		
		// 等待 t1 做完
		t1.join();
		
		System.out.println("主-結束");
	}

}
