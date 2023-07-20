package day23;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class JobDemo {

	public static void main(String[] args) {
		ExecutorService service = Executors.newCachedThreadPool();
		service.submit(new ShortJob());
		service.submit(new ShortJob());
		service.submit(new LongJob());
		service.submit(new LongJob());
		service.submit(new ShortJob());
		
		service.shutdown(); // 上述任務執行完畢之後就將 service 關閉
		

	}

}
