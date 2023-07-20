package day23;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class LongJob implements Callable {

	@Override
	public Object call() throws Exception {
		System.out.println("長任務開始");
		TimeUnit.SECONDS.sleep(3);
		System.out.println("長任務結束");
		return null;
	}
	
}
