package day22;

public class Spelling {

	public static void main(String[] args) throws InterruptedException {
		// 主執行緒拼 A, D
		// 子執行緒拼 B, C
		// 最後結果 A, B, C, D
		System.out.println("主執行緒 A");
		
		Thread t1 = new Thread(()->{
			System.out.println("子執行緒 B");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println("子執行緒 C");
		});
		t1.start();
		
		// t1.join() 主執行緒會等 t1 執行緒的工作做完之後才往下做
		//t1.join();
		t1.join(2000);
		
		System.out.println("主執行緒 D");
		System.out.println("Game Over!");

	}

}
