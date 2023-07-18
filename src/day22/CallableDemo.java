package day22;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Runnable runnable = () -> {
			System.out.println("Welcome Runnable");
		};
		
		Thread t1 = new Thread(runnable);
		t1.start();
		
		// ------------------------------------------
		Callable<Integer> callable = () -> {
			System.out.println("Welcome Callable");
			return 77;
		};
		
		//FutureTask<Integer> futureTask = new FutureTask<>(callable);
		FutureTask futureTask = new FutureTask(runnable, true);
		Thread t2 = new Thread(futureTask);
		t2.start();
		System.out.println(futureTask.get());
		
		
	}

}
