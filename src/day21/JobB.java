package day21;

// 實做一個執行緒的工作
public class JobB implements Runnable {

	@Override
	public void run() {
		// 取得類別名稱
		String className = getClass().getSimpleName();
		// 得到執行緒名稱
		String threadName = Thread.currentThread().getName();
		for(int i=2;i<=1000;i+=2) {
			System.out.printf("%s %s %d\n", className, threadName, i);
		}
	}
	
}
