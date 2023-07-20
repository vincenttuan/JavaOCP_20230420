package day23;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.Callable;

public class Lotto implements Callable {
	private SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
	
	@Override
	public Object call() throws InterruptedException {
		System.out.print("工作開始時間:" + sdf.format(new Date()));
		Thread.sleep(new Random().nextInt(2500));
		System.out.print(" 樂透數字 " + new Random().nextInt(100) + " ");
		System.out.println("工作結束時間:" + sdf.format(new Date()));
		return null;
	}
	
}
