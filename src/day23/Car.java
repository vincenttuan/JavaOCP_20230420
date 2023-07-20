package day23;

import java.util.Random;
import java.util.concurrent.CyclicBarrier;

public class Car extends Thread {
	
	private CyclicBarrier cyclicBarrier;
	
	public Car(CyclicBarrier cyclicBarrier) {
		this.cyclicBarrier = cyclicBarrier;
	}

	@Override
	public void run() {
		String tName = Thread.currentThread().getName();
		System.out.printf("%s 台北出發\n", tName);
		// 模擬作業(開車)要花費的時間
		try {
			Thread.sleep(new Random().nextInt(5000));
			System.out.printf("%s 到台中了\n", tName);
			cyclicBarrier.await(); // 等待其他執行緒
		} catch (Exception e) {
			
		}
		// 繼續往回家的路開
		System.out.printf("%s 到家了\n", tName);
	}
	
}
