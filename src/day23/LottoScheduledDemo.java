package day23;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class LottoScheduledDemo {

	public static void main(String[] args) throws Exception {
		
		ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
		
		int initDelay = 1;
		int delay = 2;
		service.scheduleWithFixedDelay(new Lotto(), initDelay, delay, TimeUnit.SECONDS);
		
		System.out.println("Lotto 工作開始");

	}

}
