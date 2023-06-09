package day21;

// 實做一個執行緒的工作
public class JobA implements Runnable {

	@Override
	public void run() {
		// 取得類別名稱
		String className = getClass().getSimpleName();
		// 得到執行緒名稱
		String threadName = Thread.currentThread().getName();
		// 印出 1~1000 之間的奇數
		for(int i=1;i<=1000;i+=2) {
			System.out.printf("%s %s %d\n", className, threadName, i);
		}
	}
	
}
