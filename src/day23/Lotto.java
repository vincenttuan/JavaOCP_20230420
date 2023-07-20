package day23;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Lotto implements Runnable {
	private SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
	
	@Override
	public void run() {
		System.out.print("工作開始時間:" + sdf.format(new Date()));
		try {
			Thread.sleep(new Random().nextInt(2500));
		} catch (Exception e) {
		}
		System.out.print(" 樂透數字 " + new Random().nextInt(100) + " ");
		System.out.println("工作結束時間:" + sdf.format(new Date()));
	}
	
}
