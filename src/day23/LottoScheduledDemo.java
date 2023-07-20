package day23;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class LottoScheduledDemo {
	
	static ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
	
	public class Callback {
		void stop() {
			service.shutdownNow();
		}
	}
	
	private void start() {
		Callback cb = new Callback();
		int initDelay = 1;
		int delay = 2;
		//service.scheduleWithFixedDelay(new Lotto(), initDelay, delay, TimeUnit.SECONDS);
		int period = 2;
		service.scheduleAtFixedRate(new Lotto(cb), initDelay, period, TimeUnit.SECONDS);
		System.out.println("Lotto 工作開始");
	}
	
	public static void main(String[] args) throws Exception {
		new LottoScheduledDemo().start();
	}

}
