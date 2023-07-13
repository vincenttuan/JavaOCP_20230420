package day21;

// 主程式
public class JobMain {
	public static void main(String[] args) {
		String threadName = Thread.currentThread().getName();
		System.out.printf("主執行緒名稱: %s\n", threadName);
		// 建立要做的工作
		JobA jobA = new JobA();
		JobB jobB = new JobB();
		// 建立執行緒並指派(放入)要做的工作
		Thread t1 = new Thread(jobA);
		Thread t2 = new Thread(jobB);
		// 設定子執行緒名稱
		t1.setName("Thread-John");
		t2.setName("Thread-Mary");
		// 開始運行 start()
		t1.start();
		t2.start();
		
	}
}
